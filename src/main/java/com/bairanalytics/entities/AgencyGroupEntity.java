package com.bairanalytics.entities;

import javax.persistence.*;


/**
 * Created by Sean on 3/25/2015.
 */

@Entity
@Table(name = "agencyGroup", schema = "dbo", catalog = "DataIntegrationDB")
public class AgencyGroupEntity {
    private int agencyGroupPk;
    private String ori;
    private int groupId;
    private Boolean owner;

    @Id
    @Column(name = "agencyGroupPK", nullable = false, insertable = true, updatable = true)
    public int getAgencyGroupPk() {
        return agencyGroupPk;
    }

    public void setAgencyGroupPk(int agencyGroupPk) {
        this.agencyGroupPk = agencyGroupPk;
    }

    @Basic
    @Column(name = "ORI", nullable = false, insertable = true, updatable = true)
    public String getOri() {
        return ori;
    }

    public void setOri(String ori) {
        this.ori = ori;
    }

    @Basic
    @Column(name = "groupID", nullable = false, insertable = true, updatable = true)
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    @Basic
    @Column(name = "owner", nullable = true, insertable = true, updatable = true)
    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyGroupEntity that = (AgencyGroupEntity) o;

        if (agencyGroupPk != that.agencyGroupPk) return false;
        if (groupId != that.groupId) return false;
        if (ori != null ? !ori.equals(that.ori) : that.ori != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agencyGroupPk;
        result = 31 * result + (ori != null ? ori.hashCode() : 0);
        result = 31 * result + groupId;
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        return result;
    }
}
