package com.blackcode.codenestapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mentorName;
    private String  email;
    private String contactNumber;
    private String areaOfExpertise;
    private String yearsOfRelatedExperience;
    private String position;
}
