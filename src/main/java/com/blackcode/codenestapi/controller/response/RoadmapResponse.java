package com.blackcode.codenestapi.controller.response;

import lombok.Data;

import java.net.URL;
import java.time.LocalDate;

@Data
public class RoadmapResponse {
    private Long id;
    private LocalDate date;
    private String rmTitle;
    private String description;
    private String mentorName;
    private String image;
}
