package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.DTO.BookingDTO;
import com.dbms.Residence.Finder.service.TenantService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private TenantService tenantService;

    public BookingController(TenantService tenantService) {
        this.tenantService = tenantService;
    }

    @PostMapping
    public String addBooking(@RequestBody BookingDTO bookingDTO){
        tenantService.bookProperty(bookingDTO);
        return "Booking Done";
    }



}
