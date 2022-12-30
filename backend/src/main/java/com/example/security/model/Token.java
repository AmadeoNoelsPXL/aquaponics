package com.example.security.model;

import javax.validation.constraints.NotBlank;

public class Token {
    @NotBlank(message = "U bent niet teogestaan")
    private String token;

    public String getToken() {
        return token;
    }
}
