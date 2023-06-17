package com.example.layered.model;

import javax.persistence.Entity;

@Entity
public class SampleEntity {
	
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
