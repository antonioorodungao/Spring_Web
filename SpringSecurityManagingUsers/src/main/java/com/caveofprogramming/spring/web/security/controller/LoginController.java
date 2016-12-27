package com.caveofprogramming.spring.web.security.controller;

import com.caveofprogramming.spring.web.security.dao.User;
import com.caveofprogramming.spring.web.security.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

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


    @RequestMapping("/admin")
    public String showAdmin(Model model) {
//        try {
            List<User> users = usersService.getAllUsers();
            model.addAttribute("users", users);
//        }catch (Exception e){
//            System.out.println(e.getClass());
//        }
        return "admin";
    }


    @RequestMapping("/login")
    public String showLogin(@RequestParam(value = "error", required = false) String error) throws Exception {

        if (error == null || error.equals("true")) {
            return "login";
        } else {
            return "home";
        }

    }

    @RequestMapping("/accessdenied")
    public String showDenied() {
        return "accessdenied";
    }

    @RequestMapping("/loggedout")
    public String showlogout() throws Exception {
        return "logout";
    }

    @RequestMapping("/createaccount")
    public String showNewAccount(Model model) {
        model.addAttribute("user", new User());
        return "createaccount";
    }

    @RequestMapping(value = "/accountcreated", method = RequestMethod.POST)
    public String accountCreated(@Valid User user, BindingResult result) throws Exception {

        if (result.hasErrors()) {
            return "createaccount";
        }

        user.setAuthority("ROLE_USER");
        user.setEnabled(true);

        if (usersService.isUserExists(user.getUsername())) {
            result.rejectValue("username", "duplicatekey.user");
            return "createaccount";
        }

        try {
            usersService.createUser(user);
        } catch (DuplicateKeyException dk) {
            result.rejectValue("username", "duplicatekey.user");
            return "createaccount";
        }

        return "accountcreated";

    }

}
