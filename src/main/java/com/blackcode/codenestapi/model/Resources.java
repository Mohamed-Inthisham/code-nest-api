package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String resTitle;
    private String description;
    @ManyToOne
    private Mentor mentor;
}
