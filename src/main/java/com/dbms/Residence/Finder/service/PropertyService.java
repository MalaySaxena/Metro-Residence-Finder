package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Landlord;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.repository.PropertyRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertyService {

    private PropertyRepository propertyRepository;

    public PropertyService(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    public void addProperty(Property property){
        propertyRepository.save(property);
    }

    public Property getProperty(Long id){
        return propertyRepository.findById(id).get();
    }

    public List<Property> getAllProperty(){
        return (List<Property>) propertyRepository.findAll();
    }

    public List<Property> getPopularProperty(){
        return propertyRepository.findByPopularProperty();
    }

    public List<Property> getPremiumProperty(){
        return propertyRepository.findByPremiumProperty();
    }

    public void setOwnerOfProperty(Landlord landlord, Property property){
        property.setLandlord(landlord);
        propertyRepository.save(property);
    }

}
