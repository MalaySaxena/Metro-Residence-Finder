package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.service.TenantService;
import org.hibernate.hql.internal.ast.tree.ResolvableNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tenant")
public class TenantController {

    private TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping
    public ResponseEntity<String> createTenant(@RequestBody Tenant tenant){
        tenantService.addTenant(tenant);
        return new ResponseEntity<String>("Tenant Created", HttpStatus.OK );
    }

    @PutMapping("/update")
    public void updateTenant(){}

    @GetMapping("/check_mobile/{mobile}")
    public ResponseEntity<Tenant> getTenantByMobile(@PathVariable("mobile") Long mobile){
        return new ResponseEntity<Tenant>(tenantService.getTenantByPhoneNo(mobile),HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Tenant> getTenantById(@PathVariable("id") Long id){
        return new ResponseEntity<Tenant>(tenantService.getTenant(id),HttpStatus.OK);
    }


}
