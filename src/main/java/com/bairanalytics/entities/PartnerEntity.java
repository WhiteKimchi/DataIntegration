package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "partner", schema = "dbo", catalog = "DataIntegrationDB")
public class PartnerEntity {
    private int partnerPk;
    private String partnerName;
    private String name;
    private String ori;
    private int dataProviderId;
    private int partnerId;
    private String partnerPassword;

    @Id
    @Column(name = "partnerPK", nullable = false, insertable = true, updatable = true)
    public int getPartnerPk() {
        return partnerPk;
    }

    public void setPartnerPk(int partnerPk) {
        this.partnerPk = partnerPk;
    }

    @Basic
    @Column(name = "partner_name", nullable = false, insertable = true, updatable = true)
    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }

    @Basic
    @Column(name = "name", nullable = false, insertable = true, updatable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "data_provider_id", nullable = false, insertable = true, updatable = true)
    public int getDataProviderId() {
        return dataProviderId;
    }

    public void setDataProviderId(int dataProviderId) {
        this.dataProviderId = dataProviderId;
    }

    @Basic
    @Column(name = "partner_id", nullable = false, insertable = true, updatable = true)
    public int getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(int partnerId) {
        this.partnerId = partnerId;
    }

    @Basic
    @Column(name = "Partner Password", nullable = false, insertable = true, updatable = true)
    public String getPartnerPassword() {
        return partnerPassword;
    }

    public void setPartnerPassword(String partnerPassword) {
        this.partnerPassword = partnerPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PartnerEntity that = (PartnerEntity) o;

        if (dataProviderId != that.dataProviderId) return false;
        if (partnerId != that.partnerId) return false;
        if (partnerPk != that.partnerPk) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (ori != null ? !ori.equals(that.ori) : that.ori != null) return false;
        if (partnerName != null ? !partnerName.equals(that.partnerName) : that.partnerName != null) return false;
        if (partnerPassword != null ? !partnerPassword.equals(that.partnerPassword) : that.partnerPassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = partnerPk;
        result = 31 * result + (partnerName != null ? partnerName.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ori != null ? ori.hashCode() : 0);
        result = 31 * result + dataProviderId;
        result = 31 * result + partnerId;
        result = 31 * result + (partnerPassword != null ? partnerPassword.hashCode() : 0);
        return result;
    }
}
