package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.controller.response.CourseContentResponse;
import com.blackcode.codenestapi.controller.response.ResourceResponse;
import com.blackcode.codenestapi.dto.CourseContentDTO;
import com.blackcode.codenestapi.dto.ResourceDTO;
import com.blackcode.codenestapi.service.CourseContentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CourseContentController {
    private CourseContentService courseContentService;

    @PostMapping("/content")
    public CourseContentResponse create(@RequestBody CourseContentDTO contentDTO){
        return courseContentService.create(contentDTO);
    }
    @GetMapping("/content")
    public List<CourseContentResponse> getAll(){
        return courseContentService.getAll();
    }
    @DeleteMapping("/content/{id}")
    public void delete(@PathVariable ("id")Long id){
        courseContentService.delete(id);
    }
}
