package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.controller.response.ResourceResponse;
import com.blackcode.codenestapi.dto.ResourceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResourceService {
    ResourceResponse create(ResourceDTO resourceDTO);

    List<ResourceResponse> getAll();

    void delete(Long id);
}
