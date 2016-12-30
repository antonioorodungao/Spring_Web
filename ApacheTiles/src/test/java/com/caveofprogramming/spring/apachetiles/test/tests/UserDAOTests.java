package com.caveofprogramming.spring.apachetiles.test.tests;

import com.caveofprogramming.spring.apachetiles.dao.User;
import com.caveofprogramming.spring.apachetiles.dao.UsersDAO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by anton on 12/30/2016.
 */

@ActiveProfiles("dev")
@ContextConfiguration(locations = {"classpath*:dao-context.xml",
"classpath*:security-context.xml", "classpath*:/datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    UsersDAO usersDAO;

    @Before
    public void init(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("delete from offers");
        jdbcTemplate.execute("delete from users");
        jdbcTemplate.execute("delete from authorities");

    }

    @Test
    public void testCreateUser(){

        User user = new User("antonio", "password", true, "antonioorodungao@yahoo.com", "ROLE_ADMIN");

        assertTrue("User creation should return true", usersDAO.createUser(user));

        List<User> list = usersDAO.getAllUsers();

        assertEquals("Number of users should be equal to 1.", 1, list.size());

        assertEquals("User inserted should be the same as retrieved", user, usersDAO.getUser(user.getUsername()));

    }

}
