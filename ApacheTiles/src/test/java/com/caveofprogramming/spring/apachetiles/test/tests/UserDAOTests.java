package com.caveofprogramming.spring.apachetiles.test.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by anton on 12/30/2016.
 */

@ActiveProfiles("dev")
@ContextConfiguration(locations = {"classpath*:dao-context.xml",
"classpath*:security-context.xml", "classpath*:/datasource.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UserDAOTests {

    @Test
    public void testCreateUser(){
        assertEquals("Dummy Test", 1, 1);
    }

}
