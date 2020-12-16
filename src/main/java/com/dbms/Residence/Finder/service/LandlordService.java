package com.dbms.Residence.Finder.service;

import com.dbms.Residence.Finder.models.Landlord;
import com.dbms.Residence.Finder.repository.LandlordRepository;
import org.springframework.stereotype.Service;

@Service
public class LandlordService {
    public LandlordService(LandlordRepository landlordRepository) {
        this.landlordRepository = landlordRepository;
    }

    private LandlordRepository landlordRepository;

    public void addLandlord(Landlord landlord){
        landlordRepository.save(landlord);
    }

    public Landlord getLandlord(Long id){
        return landlordRepository.findById(id).get();
    }

}
