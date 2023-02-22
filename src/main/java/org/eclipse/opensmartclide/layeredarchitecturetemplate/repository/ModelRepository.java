package org.eclipse.opensmartclide.layeredarchitecturetemplate.repository;

import org.eclipse.opensmartclide.layeredarchitecturetemplate.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends JpaRepository<Model, Long> {


}