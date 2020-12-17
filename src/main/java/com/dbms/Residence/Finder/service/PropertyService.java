package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Landlord;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.repository.PropertyRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PropertyService {

    private PropertyRepository propertyRepository;
    private LandmarkService landmarkService;

    public PropertyService(PropertyRepository propertyRepository, LandmarkService landmarkService) {
        this.propertyRepository = propertyRepository;
        this.landmarkService = landmarkService;
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

    public List<Property> getPopularProperty(String latitude, String longitude){
        List<Property> popularProperty = propertyRepository.findByPopularProperty();
        //popularProperty = landmarkService.getNearProperty(latitude,longitude,popularProperty,10);
        return popularProperty;
    }

    public List<Property> getPremiumProperty(String latitude, String longitude){
        List<Property> premiumProperty = propertyRepository.findByPremiumProperty();
        System.out.println(premiumProperty);
        premiumProperty = landmarkService.getNearProperty(latitude,longitude,premiumProperty,25);
        System.out.println(premiumProperty);
        return premiumProperty;
    }

    public void setOwnerOfProperty(Landlord landlord, Property property){
        property.setLandlord(landlord);
        propertyRepository.save(property);
    }

}
