package com.dbms.Residence.Finder.repository;

import com.dbms.Residence.Finder.models.Tenant;
import org.springframework.data.repository.CrudRepository;

public interface TenantRepository extends CrudRepository<Tenant, Long> {

    Tenant findByPhoneNo(String phoneNo);

}
