package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String address;
    private String contact;
    private String email;
    private String password;
    private String companyOwner;
    private String brNo;
    @OneToMany(mappedBy = "company")
    private List<Course> courses;
    @OneToMany(mappedBy = "company")
    private List<Internship> internships;


}