package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.controller.response.CourseContentResponse;
import com.blackcode.codenestapi.dto.CourseContentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseContentService {
    CourseContentResponse create(CourseContentDTO contentDTO);

    List<CourseContentResponse> getAll();

    void delete(Long id);
}
