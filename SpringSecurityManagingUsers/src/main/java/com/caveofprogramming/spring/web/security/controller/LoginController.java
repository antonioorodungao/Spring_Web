package com.caveofprogramming.spring.web.security.controller;

import com.caveofprogramming.spring.web.security.dao.User;
import com.caveofprogramming.spring.web.security.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by anton on 12/19/2016.
 */

@Controller
public class LoginController {

    @Autowired
    private UsersService usersService;

    public UsersService getUsersService() {
        return usersService;
    }

    @Autowired
    public void setUsersService(UsersService usersService) {
        this.usersService = usersService;
    }

    @RequestMapping("/login")
    public String showLogin() throws Exception{
        return "login";
    }

    @RequestMapping("/createaccount")
    public String showNewAccount(Model model){
        model.addAttribute("user", new User());
        return "createaccount";
    }

    @RequestMapping(value="/accountcreated", method = RequestMethod.POST)
    public String accountCreated(@Valid User user, BindingResult result) throws Exception{

        if(result.hasErrors()) {
            return "createaccount";
        }

        user.setAuthority("user");
        user.setEnabled(true);

        if(usersService.isUserExists(user.getUsername())){
            result.rejectValue("username", "duplicatekey.user");
            return "createaccount";
        }

        try {
            usersService.createUser(user);
        }catch (DuplicateKeyException dk){
            result.rejectValue("username", "duplicatekey.user");
            return "createaccount";
        }

        return "accountcreated";

    }

}
