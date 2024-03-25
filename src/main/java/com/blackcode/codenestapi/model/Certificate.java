package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String certificateName;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Student student;

}
