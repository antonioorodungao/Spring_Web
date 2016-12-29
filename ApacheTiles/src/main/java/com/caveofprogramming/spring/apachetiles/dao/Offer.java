package com.caveofprogramming.spring.apachetiles.dao;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


/**
 * Created by anton on 11/26/2016.
 */
@Component("offer")
public class Offer {

    private int id;

    @NotNull
    @Size(min = 5, max =  10, message = "Name must be between 5 and 100")
    private String name;

    @NotNull
    @Pattern(regexp = ".+@.+\\..*", message = "Invalid email address")
    private String email;

    @NotNull
    @Size(min=20, max=100, message = "Offer should be between 20 and 255")
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
