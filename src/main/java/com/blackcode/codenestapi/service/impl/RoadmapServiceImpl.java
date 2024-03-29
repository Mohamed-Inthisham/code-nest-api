package com.blackcode.codenestapi.service.impl;

import com.blackcode.codenestapi.controller.response.ResourceResponse;
import com.blackcode.codenestapi.controller.response.RoadmapResponse;
import com.blackcode.codenestapi.dto.RoadmapDTO;
import com.blackcode.codenestapi.model.Resources;
import com.blackcode.codenestapi.model.Roadmap;
import com.blackcode.codenestapi.repository.RoadmapRepository;
import com.blackcode.codenestapi.service.RoadmapService;
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
public class RoadmapServiceImpl implements RoadmapService {
    private RoadmapRepository roadmapRepository;
    private ModelMapper modelMapper;

    public static String uploadDirectory = System.getProperty("user.dir") + "/src/main/webapp/roadMapImages";

    @Override
    public RoadmapResponse create(RoadmapDTO roadmapDTO, MultipartFile file) throws IOException {
        Roadmap roadmap =modelMapper.map(roadmapDTO,Roadmap.class);
        roadmap.setDate(LocalDate.now());
        String originalFilename = file.getOriginalFilename();
        Path fileNameAndPath = Paths.get(uploadDirectory, originalFilename);
        Files.write(fileNameAndPath, file.getBytes());
        roadmap.setImage(originalFilename);
        roadmapRepository.save(roadmap);
        return modelMapper.map(roadmap, RoadmapResponse.class);
    }

    @Override
    public List<RoadmapResponse> getAll() {
        List<Roadmap> roadmapList = roadmapRepository.findAll();
        List<RoadmapResponse> roadmapResponseList=new ArrayList<>();
        for(Roadmap roadmap :roadmapList){
            RoadmapResponse roadmapResponse=modelMapper.map(roadmap, RoadmapResponse.class);
            roadmapResponseList.add(roadmapResponse);
        }
        return roadmapResponseList;
    }

    @Override
    public void delete(Long id) {
        roadmapRepository.deleteById(id);

    }
}
