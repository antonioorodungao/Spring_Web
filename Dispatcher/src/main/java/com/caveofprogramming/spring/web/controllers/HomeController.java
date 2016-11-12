package com.caveofprogramming.spring.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Oro on 10/12/2016.
 */

@Controller
public class HomeController {

//    @RequestMapping("/home")
//    public String showHome(HttpSession session){
//        System.out.println("Passing through....");
//        session.setAttribute("name", "Antonio Oro Dungao");
//        return "home";
//
//
//    }

    //Using ModelandView
//    @RequestMapping("/home")
//    public ModelAndView showHome(){
//        System.out.println("Passing through....");
//        ModelAndView mv = new ModelAndView("home");
//
//        Map<String, Object> model = mv.getModel();
//        model.put("name", "Model and View");
//        return mv;
//
//
//    }

    //Using Model parameter
    @RequestMapping("/home")
    public ModelAndView showHome(Model model){
        System.out.println("Passing through....");
        ModelAndView mv = new ModelAndView("home");

        model.addAttribute("name", "Model Parameter");
        return mv;


    }

    @RequestMapping("/db")
    public ModelAndView getModel(Model model){

        model.addAttribute("dbname", "Sample DB Oro");
        ModelAndView mv = new ModelAndView("db");
        return mv;

    }
}
