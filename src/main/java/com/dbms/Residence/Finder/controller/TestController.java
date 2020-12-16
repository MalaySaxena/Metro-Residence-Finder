package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Gender;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    TenantRepository tenantRepository;

    @GetMapping("/hello")
    public String getTest(){
        System.out.println("Controller working");
        return "Hi user";
    }

    @GetMapping("/tenant")
    public String get(){
        return "hello";
    }

    @PostMapping("/tenant")
    public void set(){
        System.out.println("post");
        tenantRepository.save(new Tenant("malay",9344,"23", Gender.Male,new Date(),
                "Indore", "Indian", 2400, "ew", Boolean.TRUE));
    }
}
