package com.dbms.Residence.Finder.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Entity
public class Property extends Locality{

    private String name;

    private int price;

    @Column(name = "update_time")
    private Date updateTime;

    private BigDecimal rating;

    private String description;

    private Boolean flag;

    private String type;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "availaibility_status")
    private String availaibilityStatus;

    private Byte[] image;

    @Column(name = "existing_people")
    private int existingPeople;

    private int bhk;

    private int areaSqFt;

    private String furnishedStatus;

    public int getAreaSqFt() {
        return areaSqFt;
    }

    public void setAreaSqFt(int areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    public String getFurnishedStatus() {
        return furnishedStatus;
    }

    public void setFurnishedStatus(String furnishedStatus) {
        this.furnishedStatus = furnishedStatus;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(String bathrooms) {
        this.bathrooms = bathrooms;
    }

    private String deposit;

    private String bathrooms;

    @JsonBackReference
    @ManyToOne
    private Landlord landlord;

    @JsonManagedReference
    @OneToMany(mappedBy = "property")
    private List<Tenant> tenantList;

    //how to get

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Landlord getLandlord() {
        return landlord;
    }

    public void setLandlord(Landlord landlord) {
        this.landlord = landlord;
    }

    public List<Tenant> getTenantList() {
        return tenantList;
    }

    public void setTenantList(List<Tenant> tenantList) {
        this.tenantList = tenantList;
    }

    public String getAvailaibilityStatus() {
        return availaibilityStatus;
    }

    public void setAvailaibilityStatus(String availaibilityStatus) {
        this.availaibilityStatus = availaibilityStatus;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }

    public int getExistingPeople() {
        return existingPeople;
    }

    public void setExistingPeople(int existingPeople) {
        this.existingPeople = existingPeople;
    }

    public int getBhk() {
        return bhk;
    }

    public void setBhk(int bhk) {
        this.bhk = bhk;
    }
}
