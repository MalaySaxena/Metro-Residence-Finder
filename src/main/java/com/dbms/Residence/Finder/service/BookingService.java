package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Booking;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;

@Service
public class BookingService {

    private BookingRepository bookingRepository;

    public BookingService(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    public void addBooking(Tenant tenant, Property property, Date checkIn, Date checkOut, String comments){
        bookingRepository.save(new Booking(tenant, property, checkIn, checkOut, comments));
    }

}
