package org.eclipse.opensmartclide.layeredarchitecturetemplate.repository;

import org.eclipse.opensmartclide.layeredarchitecturetemplate.service.Service;
import org.springframework.data.repository.CrudRepository;

public interface ServiceRepository extends CrudRepository<Service, Long> {


}