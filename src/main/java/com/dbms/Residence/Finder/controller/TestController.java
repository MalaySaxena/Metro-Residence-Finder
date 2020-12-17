package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Gender;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.repository.PropertyRepository;
import com.dbms.Residence.Finder.repository.TenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Optional;

@RestController
public class TestController {

    @Autowired
    TenantRepository tenantRepository;

    @Autowired
    PropertyRepository propertyRepository;

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
        tenantRepository.save(new Tenant("malay","9344","23", Gender.Male,new Date(),
                "Indore", "Indian", 2400, "ew", Boolean.TRUE));
    }

    @PostMapping("/property")
    public void setP(){
        System.out.println("post");
        //propertyRepository.save(new Property("p1"));
    }

    @GetMapping("/yes")
    public void yes(){
        System.out.println("post");
        Optional<Property> pr = propertyRepository.findById(5L);

        Optional<Tenant> tenant = tenantRepository.findById(2L);

        Tenant t = tenant.get();
        Property p = pr.get();

        t.setProperty(p);

        tenantRepository.save(t);
    }

    @GetMapping("/customHeader")
    public ResponseEntity<String> customHeader() {
        return ResponseEntity.ok()
                .header("Custom-Header", "foo")
                .body("Custom header set");
    }
}
