package com.example.layered.controller;

import com.example.layered.model.SampleEntity;
import com.example.layered.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntityController {
    private final EntityService entityService;

    @Autowired
    public EntityController(EntityService service) {
        this.entityService = service;
    }

    @PostMapping("/entity")
    public ResponseEntity<String> createEntity(@RequestBody String name) {
    	SampleEntity entity = entityService.createEntity(name);
        System.out.println("Created entity with name: " + entity.getName());
        return new ResponseEntity<>("Entity created with name: " + entity.getName(), HttpStatus.CREATED);
    }
}