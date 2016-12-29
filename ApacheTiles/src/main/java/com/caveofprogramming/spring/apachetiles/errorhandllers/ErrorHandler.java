package com.caveofprogramming.spring.apachetiles.errorhandllers;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


/**
 * Created by anton on 12/18/2016.
 */

@EnableWebMvc
@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException(DataAccessException ex){
        return "error";
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public String recordNotFound(EmptyResultDataAccessException ex){
        return "error";
    }

//    @ExceptionHandler(Exception.class)
//    public String genericException(Exception e){
//        System.out.println(e.getMessage());
//        return "error";
//    }

    @ExceptionHandler(AccessDeniedException.class)
    public String handleAccessDeniedException(AccessDeniedException ex){
        return "accessdenied";
    }
}
