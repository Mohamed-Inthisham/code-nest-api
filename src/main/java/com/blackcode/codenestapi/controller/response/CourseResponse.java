package com.blackcode.codenestapi.controller.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CourseResponse {
    private Long id;
    private String cTitle;
    private LocalDate date;
    private String cDescription;
    private String companyName;
    private String image;
}
