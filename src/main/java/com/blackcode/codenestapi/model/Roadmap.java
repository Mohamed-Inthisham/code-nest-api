package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.net.URL;
import java.time.LocalDate;

@Data
@Entity
public class Roadmap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String rmTitle;
    private String description;
    private String mentorName;
    private String image;


}
