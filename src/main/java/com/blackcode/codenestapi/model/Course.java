package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URL;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private LocalDate date;
    private String description;
    private String comp;
    private String image;


}
