package com.bairanalytics.entities;

import javax.persistence.*;
import java.sql.Timestamp;


/**
 * Created by Sean on 3/25/2015.
 */

@Entity
@Table(name = "agency", schema = "dbo", catalog = "DataIntegrationDB")
public class AgencyEntity {
    private int dataProviderId;
    private String agencyOri;
    private String agencyName;
    private int agencyType;
    private String agencyAddress;
    private Integer agencyState;
    private String agencyKey;
    private String agencyReportEmail;
    private boolean agencyIsActive;
    private Timestamp addDate;
    private Timestamp modifyDate;

    public String displayAgencyTag() {
        String tag = agencyName + agencyOri;
        return tag;
    }

    @Id
    @Column(name = "dataProviderID", nullable = false, insertable = true, updatable = true)
    public int getDataProviderId() {
        return dataProviderId;
    }

    public void setDataProviderId(int dataProviderId) {
        this.dataProviderId = dataProviderId;
    }

    @Basic
    @Column(name = "agencyORI", nullable = false, insertable = true, updatable = true)
    public String getAgencyOri() {
        return agencyOri;
    }

    public void setAgencyOri(String agencyOri) {
        this.agencyOri = agencyOri;
    }

    @Basic
    @Column(name = "agencyName", nullable = false, insertable = true, updatable = true)
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Basic
    @Column(name = "agencyType", nullable = false, insertable = true, updatable = true)
    public int getAgencyType() {
        return agencyType;
    }

    public void setAgencyType(int agencyType) {
        this.agencyType = agencyType;
    }

    @Basic
    @Column(name = "agencyAddress", nullable = true, insertable = true, updatable = true)
    public String getAgencyAddress() {
        return agencyAddress;
    }

    public void setAgencyAddress(String agencyAddress) {
        this.agencyAddress = agencyAddress;
    }

    @Basic
    @Column(name = "agencyState", nullable = true, insertable = true, updatable = true)
    public Integer getAgencyState() {
        return agencyState;
    }

    public void setAgencyState(Integer agencyState) {
        this.agencyState = agencyState;
    }

    @Basic
    @Column(name = "agencyKey", nullable = true, insertable = true, updatable = true)
    public String getAgencyKey() {
        return agencyKey;
    }

    public void setAgencyKey(String agencyKey) {
        this.agencyKey = agencyKey;
    }

    @Basic
    @Column(name = "agencyReportEmail", nullable = true, insertable = true, updatable = true)
    public String getAgencyReportEmail() {
        return agencyReportEmail;
    }

    public void setAgencyReportEmail(String agencyReportEmail) {
        this.agencyReportEmail = agencyReportEmail;
    }

    @Basic
    @Column(name = "agencyIsActive", nullable = false, insertable = true, updatable = true)
    public boolean isAgencyIsActive() {
        return agencyIsActive;
    }

    public void setAgencyIsActive(boolean agencyIsActive) {
        this.agencyIsActive = agencyIsActive;
    }

    @Basic
    @Column(name = "addDate", nullable = false, insertable = true, updatable = true)
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    @Basic
    @Column(name = "modifyDate", nullable = false, insertable = true, updatable = true)
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgencyEntity that = (AgencyEntity) o;

        if (agencyIsActive != that.agencyIsActive) return false;
        if (agencyType != that.agencyType) return false;
        if (dataProviderId != that.dataProviderId) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (agencyAddress != null ? !agencyAddress.equals(that.agencyAddress) : that.agencyAddress != null)
            return false;
        if (agencyKey != null ? !agencyKey.equals(that.agencyKey) : that.agencyKey != null) return false;
        if (agencyName != null ? !agencyName.equals(that.agencyName) : that.agencyName != null) return false;
        if (agencyOri != null ? !agencyOri.equals(that.agencyOri) : that.agencyOri != null) return false;
        if (agencyReportEmail != null ? !agencyReportEmail.equals(that.agencyReportEmail) : that.agencyReportEmail != null)
            return false;
        if (agencyState != null ? !agencyState.equals(that.agencyState) : that.agencyState != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dataProviderId;
        result = 31 * result + (agencyOri != null ? agencyOri.hashCode() : 0);
        result = 31 * result + (agencyName != null ? agencyName.hashCode() : 0);
        result = 31 * result + agencyType;
        result = 31 * result + (agencyAddress != null ? agencyAddress.hashCode() : 0);
        result = 31 * result + (agencyState != null ? agencyState.hashCode() : 0);
        result = 31 * result + (agencyKey != null ? agencyKey.hashCode() : 0);
        result = 31 * result + (agencyReportEmail != null ? agencyReportEmail.hashCode() : 0);
        result = 31 * result + (agencyIsActive ? 1 : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
