package com.blackcode.codenestapi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.net.URL;
import java.time.LocalDate;

@Data
public class RoadmapDTO {
    private Long id;
    private LocalDate date;
    private String rmTitle;
    private String description;
    private String mentorName;
    private MultipartFile image;
}
