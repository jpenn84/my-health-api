package com.joshualeepenn.myhealth.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    private int id;

    @Email
    private String email;

    @NotEmpty
    @Size(min = 1, max = 50)
    private String firstName;

    @NotEmpty
    @Size(min = 1, max = 50)
    private String lastName;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

}
