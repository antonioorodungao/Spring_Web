package com.caveofprogramming.spring.web.security.service;

import com.caveofprogramming.spring.web.security.dao.Offer;
import com.caveofprogramming.spring.web.security.dao.OffersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by anton on 12/12/2016.
 */

//This way we don't need to create offersDAO inside controller.

@Service
public class OffersService {

    @Autowired
    private OffersDAO offersDAO;

    public List<Offer> getCurrent(){
        return offersDAO.getOffers();
    }

    public boolean createOffer(Offer offer){
        return offersDAO.createOffer(offer);
    }

    public boolean deleteOffer(Offer offer){
        return offersDAO.deleteOffer(offer.getId());
    }

    public Offer getOffer(int id){
        return offersDAO.getOffer(id);
    }
}
