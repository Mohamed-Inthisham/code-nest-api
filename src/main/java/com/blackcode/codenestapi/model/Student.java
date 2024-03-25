package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String password;
    @ManyToMany(mappedBy = "students")
    private List<Course> courseList;
    @OneToMany(mappedBy = "student")
    private List<Certificate> certificates;
    @OneToMany(mappedBy = "student")
    private List<Internship> internships ;

}
