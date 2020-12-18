package com.dbms.Residence.Finder.repository;

import com.dbms.Residence.Finder.models.Booking;
import com.dbms.Residence.Finder.models.DTO.BookingDTO;
import com.dbms.Residence.Finder.models.PrimaryKeys.BookingPK;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, BookingPK> {

    @Query("select b from Booking b where b.id.tenantId = :tenant_id")
    List<Booking> findByTenantId(Long tenant_id);

}
