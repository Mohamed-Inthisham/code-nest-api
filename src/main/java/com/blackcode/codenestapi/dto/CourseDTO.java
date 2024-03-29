package com.blackcode.codenestapi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class CourseDTO {
    private Long id;
    private String cTitle;
    private LocalDate date;
    private String cDescription;
    private String companyName;
    private MultipartFile image;
}
