package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CourseContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cTitle;
    private String description;
    @ManyToOne
    private Course course;
}