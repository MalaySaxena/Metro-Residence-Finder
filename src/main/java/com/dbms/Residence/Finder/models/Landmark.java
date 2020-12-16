package com.dbms.Residence.Finder.models;

import javax.persistence.*;

@Entity
public class Landmark extends Locality{

    private String name;

    public Landmark(String longitude, String latitude, String address, String city, String state, String name) {
        super(longitude, latitude, address, city, state);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
