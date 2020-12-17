package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.DTO.BookingDTO;
import com.dbms.Residence.Finder.models.Property;
import com.dbms.Residence.Finder.models.Tenant;
import com.dbms.Residence.Finder.repository.TenantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TenantService {

    private TenantRepository tenantRepository;
    private PropertyService propertyService;

    public TenantService(TenantRepository tenantRepository, PropertyService propertyService, BookingService bookingService) {
        this.tenantRepository = tenantRepository;
        this.propertyService = propertyService;
        this.bookingService = bookingService;
    }

    private BookingService bookingService;

    public void addTenant(Tenant tenant){
        tenantRepository.save(tenant);
    }

    public void deleteTenant(Long id){
        tenantRepository.deleteById(id);
    }

    public Tenant getTenantByPhoneNo(Long phoneNo){
        return tenantRepository.findByPhoneNo(phoneNo);
    }

    public Tenant getTenant(Long id){
        return tenantRepository.findById(id).get();
    }

    public void updateTenant(Tenant t){
        Optional<Tenant> tenantOpt = tenantRepository.findById(t.getId());
        Tenant tenant = tenantOpt.get();

        if(tenant!=null){
            BeanUtils.copyProperties(t,tenant);
            tenantRepository.save(tenant);
        }
    }

    public void bookProperty(BookingDTO bookingDTO){
        Tenant tenant = getTenant(bookingDTO.getTenantId());
        Property property = propertyService.getProperty(bookingDTO.getPropertyId());

        tenant.setProperty(property);
        bookingService.addBooking(tenant, property, bookingDTO.getCheckIn(), bookingDTO.getCheckOut());

        tenantRepository.save(tenant);
    }

}
