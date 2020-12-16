package com.dbms.Residence.Finder.models.PrimaryKeys;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BookingPK implements Serializable {

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
