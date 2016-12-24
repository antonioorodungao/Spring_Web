package com.caveofprogramming.spring.web.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anton on 11/25/2016.
 */

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/")
    public String showHome2(){
        return "home";
    }



}
