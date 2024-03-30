package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.controller.response.RoadmapResponse;
import com.blackcode.codenestapi.dto.RoadmapDTO;
import com.blackcode.codenestapi.service.RoadmapService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@AllArgsConstructor
public class roadmapController {
    private RoadmapService roadmapService;

    @PostMapping("/roadmaps")
        public RoadmapResponse create(@ModelAttribute RoadmapDTO roadmapDTO, @RequestParam("image")MultipartFile file) throws IOException {
        return roadmapService.create(roadmapDTO, file);
        }
    @GetMapping("/roadmaps")
        public List<RoadmapResponse> getAllRoadmaps(){
        return roadmapService.getAll();
    }
    @DeleteMapping("/roadmaps/{id}")
    public void delete(@PathVariable ("id")Long id){
        roadmapService.delete(id);
    }
}

