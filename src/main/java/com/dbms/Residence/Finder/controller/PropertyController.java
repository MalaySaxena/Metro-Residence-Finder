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
    public HashMap<String,Object> getAllProperty(){

        List<Property> properties = propertyService.getAllProperty();
        HashMap<String,Object> hashMap = new HashMap<>();

        if (properties!=null){
            hashMap.put("data",properties);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }

        return hashMap;
    }

    @PostMapping
    public String addProperty(@RequestBody Property property){
        propertyService.addProperty(property);
        return "Property added";
    }

    @GetMapping("/popular")
    public HashMap<String,Object> getPopularProperty(@RequestParam("lat") String latitude, @RequestParam("long") String longitude){

        List<Property> properties = propertyService.getPopularProperty(latitude, longitude);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (properties!=null){
            hashMap.put("data",properties);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }

        return hashMap;
    }

    @GetMapping("/premium")
    public HashMap<String,Object> getPremiumProperty(@RequestParam("lat") String latitude, @RequestParam("long") String longitude){

        List<Property> properties = propertyService.getPremiumProperty(latitude, longitude);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (properties!=null){
            hashMap.put("data",properties);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }

        return hashMap;
    }


}
