package com.dbms.Residence.Finder.controller;


import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.service.PropertyService;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/get/{id}")
    public HashMap<String,Object> getProperty(@PathVariable("id") Long id){
        HashMap<String,Object> hashMap = new HashMap<>();

        Property property = propertyService.getProperty(id);

        if(property!=null){
            hashMap.put("data",property);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }

        return hashMap;
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
