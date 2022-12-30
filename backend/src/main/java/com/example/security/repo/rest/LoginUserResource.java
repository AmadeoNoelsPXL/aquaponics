package com.example.security.repo.rest;

import javax.validation.constraints.NotBlank;

public class LoginUserResource {
    @NotBlank(message = "the email field cannot be null")
    private String email;
    @NotBlank(message = "the password field cannot be null")
    private String password;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
