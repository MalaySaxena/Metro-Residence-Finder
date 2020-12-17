package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.service.TenantService;
import org.hibernate.hql.internal.ast.tree.ResolvableNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/tenant")
public class TenantController {

    private TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping
    public HashMap<String,Object> createTenant(@RequestBody Tenant tenant){
        tenantService.addTenant(tenant);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("data","Tenant Created");
        hashMap.put("status",true);
        return hashMap;
    }

    @PutMapping("/update")
    public void updateTenant(@RequestBody Tenant tenant){
        tenantService.updateTenant(tenant);
    }

    @GetMapping("/check_mobile/{mobile}")
    public HashMap<String,Object> getTenantByMobile(@PathVariable("mobile") String mobile){

        Tenant tenant = tenantService.getTenantByPhoneNo(mobile);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (tenant!=null){
            hashMap.put("data",tenant);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }

        return hashMap;
    }

    @GetMapping("/get/{id}")
    public HashMap<String,Object> getTenantById(@PathVariable("id") Long id){

        Tenant tenant = tenantService.getTenant(id);
        HashMap<String,Object> hashMap = new HashMap<>();

        if (tenant!=null){
            hashMap.put("data",tenant);
            hashMap.put("status",true);
        }else{
            hashMap.put("status",false);
        }


        return hashMap;
    }


}
