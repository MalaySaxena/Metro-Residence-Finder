package com.dbms.Residence.Finder.controller;


import com.dbms.Residence.Finder.models.Booking;
import com.dbms.Residence.Finder.models.BookingDTO;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.service.PropertyService;
import com.dbms.Residence.Finder.service.TenantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Property> getProperty(@PathVariable("id") Long id){
        return new ResponseEntity<Property>(propertyService.getProperty(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Property>> getAllProperty(){
        return new ResponseEntity<List<Property>>(propertyService.getAllProperty(),HttpStatus.OK);
    }

    @PostMapping
    public String addProperty(@RequestBody Property property){
        propertyService.addProperty(property);
        return "Property added";
    }

    @GetMapping("/popular")
    public ResponseEntity<List<Property>> getPopularProperty(){
        return new ResponseEntity<List<Property>>(propertyService.getPopularProperty(), HttpStatus.OK);
    }

    @GetMapping("/premium")
    public ResponseEntity<List<Property>> getPremiumProperty(){
        return new ResponseEntity<List<Property>>(propertyService.getPremiumProperty(), HttpStatus.OK);
    }


}
