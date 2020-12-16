package com.dbms.Residence.Finder.models;

import javax.persistence.*;

@Entity

public class Landmark extends Locality{


    private String name;

    public Landmark(){
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
