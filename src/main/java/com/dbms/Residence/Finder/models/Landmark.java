package com.dbms.Residence.Finder.models;

import javax.persistence.*;

@Entity
@Table(name = "tbl_property")
public class Landmark {


    @Id
    @GeneratedValue
    @Column(name = "locality_id")
    private Long localityId;

    private String name;

    public Landmark(String name) {
        this.name = name;
    }

    public int getLocalityId() {
        return localityId;
    }

    public void setLocalityId(int localityId) {
        this.localityId = localityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
