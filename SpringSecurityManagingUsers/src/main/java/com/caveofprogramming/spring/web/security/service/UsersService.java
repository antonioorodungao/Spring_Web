package com.caveofprogramming.spring.web.security.service;

import com.caveofprogramming.spring.web.security.dao.User;
import com.caveofprogramming.spring.web.security.dao.UsersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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


}
