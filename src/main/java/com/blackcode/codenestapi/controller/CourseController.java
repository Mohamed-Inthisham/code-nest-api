package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.controller.response.CourseResponse;
import com.blackcode.codenestapi.controller.response.RoadmapResponse;
import com.blackcode.codenestapi.dto.CourseDTO;
import com.blackcode.codenestapi.service.CourseReportService;
import com.blackcode.codenestapi.service.CourseService;
import lombok.AllArgsConstructor;
import net.sf.jasperreports.engine.JRException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class CourseController {
    private CourseService courseService;
    private CourseReportService courseReportService;
    @PostMapping("/courses")
    public CourseResponse create(@ModelAttribute CourseDTO courseDTO,@RequestParam("image") MultipartFile file) throws IOException {
        return courseService.create(courseDTO,file);
    }
    @GetMapping("/courses")
    public List<CourseResponse> getAllCourses(){
        return courseService.getAll();
    }
    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable ("id")Long id){
        courseService.delete(id);
    }

    @GetMapping("/course/report/{format}")
    public String generateReport(@PathVariable String format)throws FileNotFoundException, JRException {
        return courseReportService.exportReport(format);
    }

}
