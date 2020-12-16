package com.dbms.Residence.Finder.repository;

import com.dbms.Residence.Finder.models.Booking;
import com.dbms.Residence.Finder.models.PrimaryKeys.BookingPK;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<Booking, BookingPK> {
}
