package com.caveofprogramming.spring.web.security.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by anton on 12/20/2016.
 */
@Component
public class UsersDAO {
    private NamedParameterJdbcTemplate jdbc;

    @Autowired
    public void setDataSource(DataSource jdbc){
        this.jdbc = new NamedParameterJdbcTemplate(jdbc);
    }



    public boolean createUser(User user){
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(user);
        jdbc.update("insert into users (username,password,email, enabled) values(:username, :password, :email, :enabled)", param );

        return  jdbc.update("insert into authorities(username, authority) values (:username, :authority)", param) == 1;

    }


}
