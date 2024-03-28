package com.blackcode.codenestapi.controller;

import com.blackcode.codenestapi.controller.response.ResourceResponse;
import com.blackcode.codenestapi.dto.ResourceDTO;
import com.blackcode.codenestapi.service.ResourceService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ResourcesController {
    private ResourceService resourceService;
    @PostMapping("/resources")
    public ResourceResponse create(@RequestBody ResourceDTO resourceDTO){
        return resourceService.create(resourceDTO);
    }
    @GetMapping("/resources")
    public List<ResourceResponse> getAll(){
        return resourceService.getAll();
    }
    @DeleteMapping("/resources/{id}")
    public void delete(@PathVariable ("id")Long id){
        resourceService.delete(id);
    }
}


