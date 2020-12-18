package com.dbms.Residence.Finder.models;

import com.dbms.Residence.Finder.models.PrimaryKeys.BookingPK;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Booking {

    @EmbeddedId
    private BookingPK id;

    @ManyToOne
    @MapsId("tenantId")
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @ManyToOne
    @MapsId("propertyId")
    @JoinColumn(name = "property_id")
    private Property property;


    @Column(name = "check_in")
    private Date checkIn ;

    @Column(name = "check_out")
    private Date checkOut ;

    private String comments ;

    @Column(name = "created_time")

    private Timestamp createdTime ;

    @Column(name = "updated_time")
    private Timestamp updatedTime ;


    public Booking(){

    }

    @PrePersist
    public void settingCurrentTime(){
        setCreatedTime(Timestamp.valueOf(LocalDateTime.now()));
        setUpdatedTime(Timestamp.valueOf(LocalDateTime.now()));
    }

    public BookingPK getId() {
        return id;
    }

    public void setId(BookingPK id) {
        this.id = id;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public Booking(Tenant tenant, Property property, Date checkIn, Date checkOut) {
        this.tenant = tenant;
        this.property = property;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.id = new BookingPK();
        this.id.setTenantId(tenant.getId());
        this.id.setPropertyId(property.getId());
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }
}
