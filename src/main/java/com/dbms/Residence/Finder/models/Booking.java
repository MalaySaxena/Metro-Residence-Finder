package com.dbms.Residence.Finder.models;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "tbl_property")
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "tenant_id")
    private Long tenantId ;

    @Id
    @GeneratedValue
    @Column(name = "property_id")
    private Long propertyId ;

    @Column(name = "check_in")
    private Date checkIn ;

    @Column(name = "check_out")
    private Date checkOut ;

    private String comments ;

    @Column(name = "created_time")
    private Timestamp createdTime ;

    @Column(name = "updated_time")
    private Timestamp updatedTime ;

    public Booking(int propertyId, Date checkIn, Date checkOut, String comments, Timestamp createdTime, Timestamp updatedTime) {
        this.propertyId = propertyId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.comments = comments;
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
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
