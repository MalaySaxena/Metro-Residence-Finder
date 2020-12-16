package com.dbms.Residence.Finder.controller;

import org.hibernate.hql.internal.ast.tree.ResolvableNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tenant")
public class TenantController {

    @PostMapping
    public ResponseEntity<String> createTenant(){
        return new ResponseEntity<String>("Tenant Created", HttpStatus.OK );
    }

    @PutMapping("/update")
    public void updateTenant(){}

    @GetMapping("/check_mobile/{mobile}")
    public void getTenantByMonbile(){}


}
