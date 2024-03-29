package com.blackcode.codenestapi.service;

import com.blackcode.codenestapi.controller.response.InternshipResponse;
import com.blackcode.codenestapi.dto.InternshipDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface InternshipService {
    InternshipResponse create(InternshipDTO internshipDTO, MultipartFile file) throws IOException;

    List<InternshipResponse> getAll();

    void delete(Long id);
}
