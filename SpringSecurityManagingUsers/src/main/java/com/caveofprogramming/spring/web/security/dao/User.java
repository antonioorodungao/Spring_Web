package com.caveofprogramming.spring.web.security.dao;

import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by anton on 12/20/2016.
 */
@Component("user")
public class User {
    @NotNull
    @Size(min = 5, message = "Username must be more 5 characters.")
    private String username;
    @NotNull
    @Size(min = 8, message = "Password should be equal or more than 8 characters.")
    private String password;

    private boolean enabled;
    @NotNull
    @Pattern(regexp = ".+@.+\\..*", message = "Invalid email address.")
    private String email;
    private String authority;

    public User(String username, String password, boolean enabled, String email, String authority) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
        this.authority = authority;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }
}
