package com.caveofprogramming.spring.web.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anton on 12/19/2016.
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showLogin(){
        return "login";
    }
}
