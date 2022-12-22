package be.pxl.backend.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long Id;
    @Pattern(regexp="^[A-Za-z]*$",message = "The input only accept alphabet")
    @NotBlank(message = "The firstname needs to be filled in")

    private String firstName;
    @NotBlank(message = "The lastname needs to be filled in")

    private String lastName;
    @NotBlank(message = "The phone number needs to be filled in")
    @Column(unique = true)
    private String phoneNumber;
    @NotBlank(message = "The email needs to be filled in")
    @Email
    @Column(unique = true)
    private String email;
    private Role role;

    public User(String firstName, String lastName, String phoneNumber, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.role = Role.TECHNICIAN;
    }

    public User(){}

    public Long getId() {
        return Id;
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

    public Role getRole() {
        return role;
    }
}
