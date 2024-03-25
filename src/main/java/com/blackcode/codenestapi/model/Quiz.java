package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    private String ans1;
    private String ans2;
    private String ans3;
    private String ans4;
    @ManyToOne
    private Course course;


}