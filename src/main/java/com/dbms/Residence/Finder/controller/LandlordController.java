package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Landlord;
import com.dbms.Residence.Finder.service.LandlordService;
import org.springframework.web.bind.annotation.*;

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


}
