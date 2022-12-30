package com.example.security.repo.rest.resource;

import com.example.security.model.Role;

public class UserDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String role;
    private Long id;

    public boolean isLocked() {
        return locked;
    }

    private boolean locked;

    public UserDto(String firstname, String lastName, String email, String phoneNumber, String role, boolean locked){
        this.firstName = firstname;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role = role;
        this.locked = locked;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
