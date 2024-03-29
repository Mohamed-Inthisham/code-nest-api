package com.blackcode.codenestapi.controller.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseContentResponse {
    private Long id;
    private LocalDate date;
    private String c_title;
    private String description;
}
