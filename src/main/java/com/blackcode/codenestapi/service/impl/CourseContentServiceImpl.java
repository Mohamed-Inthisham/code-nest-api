package com.blackcode.codenestapi.service.impl;

import com.blackcode.codenestapi.controller.response.CourseContentResponse;
import com.blackcode.codenestapi.dto.CourseContentDTO;
import com.blackcode.codenestapi.model.CourseContent;
import com.blackcode.codenestapi.repository.CourseContentRepository;
import com.blackcode.codenestapi.service.CourseContentService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseContentServiceImpl implements CourseContentService {

    private ModelMapper modelMapper;
    private CourseContentRepository contentRepository;
    @Override
    public CourseContentResponse create(CourseContentDTO contentDTO) {
        CourseContent courseContent =modelMapper.map(contentDTO,CourseContent.class);
        courseContent.setDate(LocalDate.now());
        contentRepository.save(courseContent);
        return modelMapper.map(courseContent, CourseContentResponse.class);
    }

    @Override
    public List<CourseContentResponse> getAll() {
        List<CourseContent> contentList=contentRepository.findAll();
        return contentList.stream()
                .map(content -> modelMapper.map(content, CourseContentResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        contentRepository.deleteById(id);

    }
}
