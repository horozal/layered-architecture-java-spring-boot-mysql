package com.example.layered.repository;

import com.example.layered.model.SampleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityRepository extends JpaRepository<SampleEntity, Long> {

}
