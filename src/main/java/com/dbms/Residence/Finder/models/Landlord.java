package com.dbms.Residence.Finder.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Landlord {

    public Landlord(Long id, String username, Long phoneNo, Gender gender, Date dob, String address, String nationality, Double rating, Boolean status, String remarks, boolean is_verified, Date created_at, Date updated_at) {
        this.id = id;
        this.username = username;
        this.phoneNo = phoneNo;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.nationality = nationality;
        this.rating = rating;
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
    private Long phoneNo;

    private Gender gender;

    private Date dob;

    private String address;

    private String nationality;

    private Double rating;

    private Boolean status;

    private String remarks;
    
    private Boolean is_verified;

    private Date created_at;

    private Date updated_at;

    @JsonManagedReference
    @OneToMany(mappedBy = "landlord")
    private List<Property> propertyList;

    Landlord(){

    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getIs_verified() {
        return is_verified;
    }

    public void setIs_verified(Boolean is_verified) {
        this.is_verified = is_verified;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }
}
