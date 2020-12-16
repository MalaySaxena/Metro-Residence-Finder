package com.dbms.Residence.Finder.repository;

import com.dbms.Residence.Finder.models.Property;
import org.springframework.data.repository.CrudRepository;

public interface PropertyRepository extends CrudRepository<Property, Long> {
}
