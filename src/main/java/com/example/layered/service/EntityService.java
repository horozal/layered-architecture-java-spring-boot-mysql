package com.example.layered.service;


import com.example.layered.model.SampleEntity;
import com.example.layered.repository.EntityRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    private final EntityRepository entityRepository;

    @Autowired
    public EntityService(EntityRepository repository) {
        this.entityRepository = repository;
    }

    public SampleEntity createEntity(String name) {
    	SampleEntity entity = new SampleEntity();
    	entity.setName(name);
        return entityRepository.save(entity);
    }
}