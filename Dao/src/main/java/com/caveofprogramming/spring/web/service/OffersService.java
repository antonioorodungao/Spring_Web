package com.caveofprogramming.spring.web.service;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.dao.OffersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;

/**
 * Created by anton on 11/5/2016.
 */

@Service("offersService")
public class OffersService {

    private OffersDAO offersDAO;

    public List<Offer> getCurrent(){
        return offersDAO.getOffers();
    }

    public OffersDAO getOffersDAO() {
        return offersDAO;
    }

    @Autowired
    public void setOffersDAO(OffersDAO offersDAO) {
        this.offersDAO = offersDAO;
    }

    public void throwTestException() {

        offersDAO.getOffer(99999);

    }

}
