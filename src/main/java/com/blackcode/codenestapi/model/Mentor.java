package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mentorName;
    private String  email;
    private String contact;
    private String password;
    private String educationLevel;
    private String areaOfExpertise;
    private String yearsOfRelatedExperience;
    private String position;
    @OneToMany(mappedBy = "mentor")
    private List<Roadmap> roadmaps;
    @OneToMany(mappedBy = "mentor")
    private List<Resources>  resources;
}

