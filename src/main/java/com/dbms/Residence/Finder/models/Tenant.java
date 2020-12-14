package com.dbms.Residence.Finder.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "tbl_tenant")
public class Tenant {

    @Id
    @GeneratedValue
    private Long id;

    private String username;

    @Column(name = "phone_no")
    private Integer phoneNo;

    @Column(name ="firebase_id")
    private String firebaseId;

    private Gender gender;

    private Date dob;

    private String address;

    private String nationality;

    public Tenant(String username, Integer phoneNo, String firebaseId, Gender gender, Date dob, String address, String nationality, Integer budget, String deviceToken, Boolean isVerified, Time registrationTime, Time updatedTime) {
        this.username = username;
        this.phoneNo = phoneNo;
        this.firebaseId = firebaseId;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.nationality = nationality;
        this.budget = budget;
        this.deviceToken = deviceToken;
        this.isVerified = isVerified;
        this.registrationTime = registrationTime;
        this.updatedTime = updatedTime;
    }

    private Integer budget;

    @Column(name ="device_token")
    private String deviceToken;

    @Column(name ="is_verified")
    private Boolean isVerified;

    @Column(name ="registered_time")
    private Time registrationTime;

    @Column(name ="updated_time")
    private Time updatedTime;

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

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getFirebaseId() {
        return firebaseId;
    }

    public void setFirebaseId(String firebaseId) {
        this.firebaseId = firebaseId;
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

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public Time getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Time registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Time getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Time updatedTime) {
        this.updatedTime = updatedTime;
    }
}
