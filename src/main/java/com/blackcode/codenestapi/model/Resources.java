package com.blackcode.codenestapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rTitle;
    private String desciption;
    @ManyToOne
    private Mentor mentor;
}
