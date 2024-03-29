package com.blackcode.codenestapi.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseContentDTO {
    private Long id;
    private LocalDate date;
    private String c_title;
    private String description;
}
