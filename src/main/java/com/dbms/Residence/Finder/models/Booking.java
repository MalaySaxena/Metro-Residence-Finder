package com.dbms.Residence.Finder.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Booking {

    @Embeddable
    static class BookingPK implements Serializable{

        private Long tenantId;

        private Long propertyId;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BookingPK bookPk = (BookingPK) o;
            return tenantId == bookPk.tenantId &&
                    propertyId == bookPk.propertyId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(tenantId, propertyId);
        }

        public Long getTenantId() {
            return tenantId;
        }

        public void setTenantId(Long tenantId) {
            this.tenantId = tenantId;
        }

        public Long getPropertyId() {
            return propertyId;
        }

        public void setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
        }
    }


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
