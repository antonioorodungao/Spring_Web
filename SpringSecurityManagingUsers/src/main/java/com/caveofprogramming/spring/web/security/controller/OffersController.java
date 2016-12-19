package com.caveofprogramming.spring.web.security.controller;

import com.caveofprogramming.spring.web.security.dao.Offer;
import com.caveofprogramming.spring.web.security.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by anton on 11/26/2016.
 */
@Controller
public class OffersController {

    @Autowired
    OffersService offersService;

    @RequestMapping(value = "/createoffer")
    public String createOffer(Model model) {
        model.addAttribute("offer", new Offer());
        return "createoffer";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void showTest(Model model, @RequestParam("id") String id){
        System.out.println(id);
//        return "test";
    }

    @RequestMapping("/offers")
    public String offers(Model model){
        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping(value = "/docreate", method = RequestMethod.POST)
    //@Valid is for validation
    public String doCreate(Model model, @Valid Offer offer, BindingResult result){
//        System.out.println(offer.toString());

        if(result.hasErrors()){
            System.out.println("Form does not validate");
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error: errors
                 ) {
                System.out.println(error.getDefaultMessage());

            }
            return "createoffer";
        }else {
            model.addAttribute("offer", offer);
            offersService.createOffer(offer);
            return "docreate";
        }
    }

    @RequestMapping(value="/offer")
    public String showOffer(Model model, @RequestParam ("id") int id){

        Offer offer = offersService.getOffer(id);
        model.addAttribute("offer", offer);
        return "offer";
    }
}
