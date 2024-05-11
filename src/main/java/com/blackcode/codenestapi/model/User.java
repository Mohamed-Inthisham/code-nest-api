package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fName;
    private String lName;
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    private String password;
    private String rePassword;
}
