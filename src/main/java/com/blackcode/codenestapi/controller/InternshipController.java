package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.controller.response.InternshipResponse;
import com.blackcode.codenestapi.controller.response.RoadmapResponse;
import com.blackcode.codenestapi.dto.InternshipDTO;
import com.blackcode.codenestapi.dto.RoadmapDTO;
import com.blackcode.codenestapi.service.InternshipService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class InternshipController {
    private InternshipService internshipService;

    @PostMapping("/internship")
    public InternshipResponse create(@ModelAttribute InternshipDTO internshipDTO, @RequestParam("files") MultipartFile file) throws IOException {
        return internshipService.create(internshipDTO, file);
    }
    @GetMapping("/internship")
    public List<InternshipResponse> getAllRoadmaps(){
        return internshipService.getAll();
    }
    @DeleteMapping("/internship/{id}")
    public void delete(@PathVariable ("id")Long id){
        internshipService.delete(id);
    }

}
