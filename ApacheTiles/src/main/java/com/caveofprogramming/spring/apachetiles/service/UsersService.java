package com.caveofprogramming.spring.apachetiles.service;

import com.caveofprogramming.spring.apachetiles.dao.User;
import com.caveofprogramming.spring.apachetiles.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anton on 12/20/2016.
 */
@Service
public class UsersService {

    @Autowired
    private UsersDAO usersDAO;

    public boolean createUser(User user){
        return usersDAO.createUser(user);
    }

    public boolean isUserExists(String username) {
        return usersDAO.isUserExists(username);
    }

    @Secured("ROLE_ADMIN")
    public List<User> getAllUsers() {
        return usersDAO.getAllUsers();
    }

//    public boolean userExists(User user){
//        return UsersDAO.getUser(user);
//    }


}
