package com.example.security.repo.rest.resource;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class RegisterUserResource {

    @NotBlank
    private String firstname;
    @NotBlank
    private String surname;
    @NotBlank
    private String phoneNumber;

    @Email
    @NotBlank
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
