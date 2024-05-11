package com.blackcode.codenestapi.controller.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseResponse {
    private Long id;
    private String title;
    private LocalDate date;
    private String description;
    private String comp;
    private String image;
}
