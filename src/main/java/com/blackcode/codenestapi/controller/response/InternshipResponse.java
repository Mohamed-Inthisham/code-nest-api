package com.blackcode.codenestapi.controller.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class InternshipResponse {
    private Long id;
    private LocalDate date;
    private String fullName;
    private String email;
    private String contact;
    private String cv;
}
