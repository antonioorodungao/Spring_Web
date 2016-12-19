package com.caveofprogramming.spring.web.security.errorhandllers;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by anton on 12/18/2016.
 */

@ControllerAdvice
public class DatabaseErrorHandler {
    @ExceptionHandler(DataAccessException.class)
    public String handleDatabaseException(DataAccessException ex){
        return "error";
    }

    @ExceptionHandler(EmptyResultDataAccessException.class)
    public String recordNotFound(EmptyResultDataAccessException ex){
        return "error";
    }
}
