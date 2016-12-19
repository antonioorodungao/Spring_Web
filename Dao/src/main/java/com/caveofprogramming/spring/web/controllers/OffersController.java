package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Oro on 10/12/2016.
 */

@Controller
public class OffersController {

    private OffersService offersService;

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


    @RequestMapping("/offers")
    public String showOffers(Model model){

        //offersService.throwTestException();

        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);

//        model.addAttribute("offers", offers);
        return "offers";

    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void showTest(Model model, @RequestParam("id") String id){
        System.out.println(id);
//        return "test";
    }

    @RequestMapping("/createoffer")
    public String createOffer(Model model){
        model.addAttribute("offer", new Offer());
        return "createoffer";
    }

    @RequestMapping(value="/docreate", method=RequestMethod.POST)
    public String doCreate(Model model, @Valid Offer offer, BindingResult result){  //Binding Result is for checking the fields.

        if(result.hasErrors()){
            System.out.println("Form does not validate");
            List<ObjectError> errors = result.getAllErrors();
            for(ObjectError error: errors){
                System.out.println(error.getDefaultMessage());
            }

            return "createoffer";
        }else{
            offersService.getOffersDAO().create(offer);
            System.out.println("Form validated");
        }
        System.out.println(offer);
        return "offercreated";
    }


//    @ExceptionHandler(DataAccessException.class)
//    public String handleDatabaseException(DataAccessException ex){
//        return "error";
//    }

    public OffersService getOffersService() {
        return offersService;
    }

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }
}
