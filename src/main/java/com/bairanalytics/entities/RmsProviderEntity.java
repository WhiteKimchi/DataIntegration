package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "rmsProvider", schema = "dbo", catalog = "DataIntegrationDB")
public class RmsProviderEntity {
    private int rmsProvider;
    private String providerName;

    @Id
    @Column(name = "rmsProvider", nullable = false, insertable = true, updatable = true)
    public int getRmsProvider() {
        return rmsProvider;
    }

    public void setRmsProvider(int rmsProvider) {
        this.rmsProvider = rmsProvider;
    }

    @Basic
    @Column(name = "providerName", nullable = true, insertable = true, updatable = true)
    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RmsProviderEntity that = (RmsProviderEntity) o;

        if (rmsProvider != that.rmsProvider) return false;
        if (providerName != null ? !providerName.equals(that.providerName) : that.providerName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rmsProvider;
        result = 31 * result + (providerName != null ? providerName.hashCode() : 0);
        return result;
    }
}
