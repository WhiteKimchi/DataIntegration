package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "agencyType", schema = "dbo", catalog = "DataIntegrationDB")
public class AgencyTypeEntity {
    private int agencyType;
    private String typeName;

    @Id
    @Column(name = "agencyType", nullable = false, insertable = true, updatable = true)
    public int getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(int agencyType) {
        this.agencyType = agencyType;
    }

    @Basic
    @Column(name = "typeName", nullable = false, insertable = true, updatable = true)
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyTypeEntity that = (AgencyTypeEntity) o;

        if (agencyType != that.agencyType) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agencyType;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
