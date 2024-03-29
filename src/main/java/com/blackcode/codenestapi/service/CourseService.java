package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.controller.response.CourseResponse;
import com.blackcode.codenestapi.dto.CourseDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface CourseService {
    CourseResponse create(CourseDTO courseDTO, MultipartFile file) throws IOException;

    List<CourseResponse> getAll();

    void delete(Long id);
}
