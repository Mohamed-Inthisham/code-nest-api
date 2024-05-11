package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URL;
import java.time.LocalDate;
@Data
@Entity
public class Internship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String fullName;
    private String email;
    private String contact;
    private String cv;


}

