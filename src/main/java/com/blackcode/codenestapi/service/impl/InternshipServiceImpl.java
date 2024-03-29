package com.blackcode.codenestapi.service.impl;

import com.blackcode.codenestapi.controller.response.InternshipResponse;
import com.blackcode.codenestapi.dto.InternshipDTO;
import com.blackcode.codenestapi.model.Internship;
import com.blackcode.codenestapi.repository.InternshipRepository;
import com.blackcode.codenestapi.service.InternshipService;
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
public class InternshipServiceImpl implements InternshipService {

    private InternshipRepository internshipRepository;
    private ModelMapper modelMapper;
    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/webapp/cv";


    @Override
    public InternshipResponse create(InternshipDTO internshipDTO, MultipartFile file) throws IOException {
        Internship internship =modelMapper.map(internshipDTO,Internship.class);
        internship.setDate(LocalDate.now());
        String originalFilename = file.getOriginalFilename();
        Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
        Files.write(fileNameAndPath, file.getBytes());
        internship.setCv(originalFilename);
        internshipRepository.save(internship);
        return modelMapper.map(internship, InternshipResponse.class);
    }

    @Override
    public List<InternshipResponse> getAll() {
        List<Internship> internshipList = internshipRepository.findAll();
        List<InternshipResponse> internshipResponseList=new ArrayList<>();
        for(Internship internship :internshipList){
            InternshipResponse internshipResponse=modelMapper.map(internship, InternshipResponse.class);
            internshipResponseList.add(internshipResponse);
        }
        return internshipResponseList;
    }

    @Override
    public void delete(Long id) {
        internshipRepository.deleteById(id);

    }
}
