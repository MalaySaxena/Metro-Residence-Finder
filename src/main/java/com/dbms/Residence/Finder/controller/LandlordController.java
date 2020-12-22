package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Landlord;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.service.LandlordService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/landlord")
public class LandlordController {

    private LandlordService landlordService;

    LandlordController(LandlordService landlordService){
        this.landlordService = landlordService;
    }

    @PostMapping
    public String createLandlord(@RequestBody Landlord landlord){
        landlordService.addLandlord(landlord);
        return "Landlord Created";
    }

    @GetMapping("/get/{id}")
    public HashMap<String,Object> getLandlordById(@PathVariable("id") Long id){

        Landlord landlord = landlordService.getLandlord(id);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (landlord!=null){
            hashMap.put("data",landlord);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }


        return hashMap;
    }
}
