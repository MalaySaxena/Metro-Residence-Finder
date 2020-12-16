package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Booking;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public void addBooking(Tenant tenant, Property property){
        bookingRepository.save(new Booking());
    }

}
