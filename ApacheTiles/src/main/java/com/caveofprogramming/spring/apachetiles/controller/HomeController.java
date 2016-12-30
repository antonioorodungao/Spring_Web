package com.caveofprogramming.spring.apachetiles.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by anton on 11/25/2016.
 */

@Controller
public class HomeController {

    private static Logger logger= Logger.getLogger(HomeController.class);

    @RequestMapping("/home")
    public String showHome(){
        logger.info("Showing home....");
        return "home";
    }

    @RequestMapping("/")
    public String showHome2(){
        return "home";
    }



}
