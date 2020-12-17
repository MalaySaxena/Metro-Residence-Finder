package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Landmark;
import com.dbms.Residence.Finder.service.LandmarkService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/landmark")
public class LandmarkController {

    private LandmarkService landmarkService;

    public LandmarkController(LandmarkService landmarkService) {
        this.landmarkService = landmarkService;
    }

    @GetMapping
    public ResponseEntity<List<Landmark>> getLandmarks(){
        return new ResponseEntity<List<Landmark>>(landmarkService.getAllLandmark(), HttpStatus.OK);
    }
}
