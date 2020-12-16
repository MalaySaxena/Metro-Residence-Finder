package com.dbms.Residence.Finder.repository;

import com.dbms.Residence.Finder.models.Property;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface PropertyRepository extends CrudRepository<Property, Long> {

    @Query("select p from Property p where p.rating>=4 and p.bhk>=2")
    List<Property> findByPopularProperty();

    @Query("select p from Property p where p.rating=5 and p.bhk>=5")
    List<Property> findByPremiumProperty();

}
