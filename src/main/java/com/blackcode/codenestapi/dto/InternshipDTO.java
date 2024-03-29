package com.blackcode.codenestapi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

@Data
public class InternshipDTO {
    private Long id;
    private LocalDate date;
    private String fullName;
    private String email;
    private String contact;
    private MultipartFile cv;
}
