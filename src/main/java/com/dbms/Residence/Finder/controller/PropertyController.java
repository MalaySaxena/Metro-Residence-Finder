package com.dbms.Residence.Finder.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {

    @GetMapping
    public void getProperty(){}

    @GetMapping("/{id}")
    public void getPropertyById(){}

    @GetMapping("/popular")
    public void getPopularPeoperty(){}

    @GetMapping("/premium")
    public void getPremiumProperty(){}

}
