package com.blackcode.codenestapi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class CourseDTO {
    private Long id;
    private String title;
    private LocalDate date;
    private String description;
    private String comp;
    private MultipartFile image;
}
