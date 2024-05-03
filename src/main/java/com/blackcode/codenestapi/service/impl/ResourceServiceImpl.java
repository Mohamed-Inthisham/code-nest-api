package com.blackcode.codenestapi.service.impl;

import com.blackcode.codenestapi.controller.response.ResourceResponse;
import com.blackcode.codenestapi.dto.ResourceDTO;
import com.blackcode.codenestapi.model.Resources;
import com.blackcode.codenestapi.repository.ResourceRepository;
import com.blackcode.codenestapi.service.ResourceService;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ResourceServiceImpl implements ResourceService {
    private ModelMapper modelMapper;
    private ResourceRepository resourceRepository;
    @Override
    public ResourceResponse create(ResourceDTO resourceDTO) {
        Resources resources=modelMapper.map(resourceDTO,Resources.class);
        resourceRepository.save(resources);
        return modelMapper.map(resources,ResourceResponse.class);
    }

    @Override
    public List<ResourceResponse> getAll() {
        List<Resources> resourcesList=resourceRepository.findAll();
        return resourcesList.stream()
                .map(rList -> modelMapper.map(rList, ResourceResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        resourceRepository.deleteById(id);
    }

    @Override
    public ResourceResponse update(Long id, ResourceDTO resourceDTO) {

        Optional<Resources> optionalResources=resourceRepository.findById(id);
        if(optionalResources.isPresent()){
            Resources resources=optionalResources.get();
            modelMapper.map(resourceDTO,resources);
            resources.setId(id);
            resourceRepository.save(resources);
            return modelMapper.map(resources,ResourceResponse.class);
        }

        return null;
    }
}