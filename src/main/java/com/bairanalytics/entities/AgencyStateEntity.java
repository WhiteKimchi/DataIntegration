package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "agencyState", schema = "dbo", catalog = "DataIntegrationDB")
public class AgencyStateEntity {
    private int agencyState;
    private String stateAbbreviation;
    private String stateName;

    @Id
    @Column(name = "agencyState", nullable = false, insertable = true, updatable = true)
    public int getAgencyState() {
        return agencyState;
    }

    public void setAgencyState(int agencyState) {
        this.agencyState = agencyState;
    }

    @Basic
    @Column(name = "stateAbbreviation", nullable = true, insertable = true, updatable = true)
    public String getStateAbbreviation() {
        return stateAbbreviation;
    }

    public void setStateAbbreviation(String stateAbbreviation) {
        this.stateAbbreviation = stateAbbreviation;
    }

    @Basic
    @Column(name = "stateName", nullable = false, insertable = true, updatable = true)
    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyStateEntity that = (AgencyStateEntity) o;

        if (agencyState != that.agencyState) return false;
        if (stateAbbreviation != null ? !stateAbbreviation.equals(that.stateAbbreviation) : that.stateAbbreviation != null)
            return false;
        if (stateName != null ? !stateName.equals(that.stateName) : that.stateName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = agencyState;
        result = 31 * result + (stateAbbreviation != null ? stateAbbreviation.hashCode() : 0);
        result = 31 * result + (stateName != null ? stateName.hashCode() : 0);
        return result;
    }
}
