package com.blackcode.codenestapi.service.impl;

import com.blackcode.codenestapi.controller.response.CourseResponse;
import com.blackcode.codenestapi.dto.CourseDTO;
import com.blackcode.codenestapi.model.Course;
import com.blackcode.codenestapi.repository.CourseRepository;
import com.blackcode.codenestapi.service.CourseService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {
    private ModelMapper modelMapper;
    private CourseRepository courseRepository;

    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/webapp/courseImages";


    @Override
    public CourseResponse create(CourseDTO courseDTO, MultipartFile file) throws IOException {
        Course course =modelMapper.map(courseDTO, Course.class);
        course.setDate(LocalDate.now());
        String originalFilename = file.getOriginalFilename();
        Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
        Files.write(fileNameAndPath, file.getBytes());
        course.setImage(originalFilename);
        courseRepository.save(course);
        return modelMapper.map(course, CourseResponse.class);
    }

    @Override
    public List<CourseResponse> getAll() {
        List<Course> courseList = courseRepository.findAll();
        List<CourseResponse> courseResponseList=new ArrayList<>();
        for(Course course :courseList){
            CourseResponse courseResponse=modelMapper.map(course, CourseResponse.class);
            courseResponseList.add(courseResponse);
        }
        return courseResponseList;
    }

    @Override
    public void delete(Long id) {
        courseRepository.deleteById(id);

    }
}
