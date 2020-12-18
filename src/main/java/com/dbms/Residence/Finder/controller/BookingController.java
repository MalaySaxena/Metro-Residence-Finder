package com.dbms.Residence.Finder.controller;

import com.dbms.Residence.Finder.models.DTO.BookingDTO;
import com.dbms.Residence.Finder.service.BookingService;
import com.dbms.Residence.Finder.service.TenantService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private TenantService tenantService;
    private BookingService bookingService;

    public BookingController(TenantService tenantService, BookingService bookingService) {
        this.tenantService = tenantService;
        this.bookingService = bookingService;
    }

    @PostMapping
    public String addBooking(@RequestBody BookingDTO bookingDTO){
        tenantService.bookProperty(bookingDTO);
        return "Booking Done";
    }


    @GetMapping
    public HashMap<String,Object> getAllBooking(@RequestParam("id") Long id){
        HashMap<String,Object> hashMap = new HashMap<>();

        hashMap.put("data",bookingService.findAllBookingOfTenant(id));
        hashMap.put("status",true);

        return hashMap;
    }

}
