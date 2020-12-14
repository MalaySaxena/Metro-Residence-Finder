package com.dbms.Residence.Finder.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tbl_landlord")
public class Landlord {

    public Landlord(Long id, String username, Integer phoneNo, Gender gender, Date dob, String address, String nationality, Integer rating, Landlord landlord, Boolean status, String remarks, boolean is_verified, Date created_at, Date updated_at) {
        this.id = id;
        this.username = username;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.nationality = nationality;
        this.rating = rating;
        this.landlord = landlord;
        this.status = status;
        this.remarks = remarks;
        this.is_verified = is_verified;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Column(name = "phone_no")
    private Integer phoneNo;

    private Gender gender;

    private Date dob;

    private String address;

    private String nationality;

    private Integer rating;

    @Column(name = "type")
    private Landlord landlord;

    private Boolean status;

    private String remarks;

    
    private boolean is_verified;

    private Date created_at;

    private Date updated_at;




}
