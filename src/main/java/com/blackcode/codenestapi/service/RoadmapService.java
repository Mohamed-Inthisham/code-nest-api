package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.controller.response.RoadmapResponse;
import com.blackcode.codenestapi.dto.RoadmapDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface RoadmapService {
    RoadmapResponse create(RoadmapDTO roadmapDTO, MultipartFile file) throws IOException;

    List<RoadmapResponse> getAll();

    void delete(Long id);
}
