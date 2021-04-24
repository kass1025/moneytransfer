package com.example.demo.domains;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false)
    @NotBlank(message = "First name can not be empty")
    private String firstName;
    @Column(nullable = false)
    @NotBlank(message = "Last name can not be empty")
    private String lastName;
    @Column(nullable = false,unique = true)
    @NotBlank(message = "Phone number can not be empty")
    private String phoneNumber;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "email can not be empty")
    private String email;
    @Column(nullable = false)
    private Integer pin;
    @Column(nullable = false)
    private Double balance = 0.0;
    @Column(nullable = false)
    private Boolean isVerified = true;
}

