package com.dbms.Residence.Finder.models;


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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Property(){
        super();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
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

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "availaibility_status")
    private String availaibilityStatus;

    private Byte[] image;

    @Column(name = "existing_people")
    private int existingPeople;

    private int bhk;

    @ManyToOne
    private Landlord landlord;

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
