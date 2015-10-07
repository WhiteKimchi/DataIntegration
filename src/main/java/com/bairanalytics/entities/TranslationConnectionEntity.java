package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "translationConnection", schema = "dbo", catalog = "DataIntegrationDB")
public class TranslationConnectionEntity {
    private int connectionId;
    private int dataProviderId;
    private String vpnClientType;
    private String vpnAddress;
    private String vpnUserName;
    private String vpnPassword;
    private String rdpAddress;
    private String rdpUserName;
    private String rdpPassword;
    private String connectionNotes;
    private boolean active;

    @Id
    @Column(name = "connectionID", nullable = false, insertable = true, updatable = true)
    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    @Basic
    @Column(name = "dataProviderID", nullable = false, insertable = true, updatable = true)
    public int getDataProviderId() {
        return dataProviderId;
    }

    public void setDataProviderId(int dataProviderId) {
        this.dataProviderId = dataProviderId;
    }

    @Basic
    @Column(name = "VPNClientType", nullable = true, insertable = true, updatable = true)
    public String getVpnClientType() {
        return vpnClientType;
    }

    public void setVpnClientType(String vpnClientType) {
        this.vpnClientType = vpnClientType;
    }

    @Basic
    @Column(name = "VPNAddress", nullable = true, insertable = true, updatable = true)
    public String getVpnAddress() {
        return vpnAddress;
    }

    public void setVpnAddress(String vpnAddress) {
        this.vpnAddress = vpnAddress;
    }

    @Basic
    @Column(name = "VPNUserName", nullable = true, insertable = true, updatable = true)
    public String getVpnUserName() {
        return vpnUserName;
    }

    public void setVpnUserName(String vpnUserName) {
        this.vpnUserName = vpnUserName;
    }

    @Basic
    @Column(name = "VPNPassword", nullable = true, insertable = true, updatable = true)
    public String getVpnPassword() {
        return vpnPassword;
    }

    public void setVpnPassword(String vpnPassword) {
        this.vpnPassword = vpnPassword;
    }

    @Basic
    @Column(name = "RDPAddress", nullable = true, insertable = true, updatable = true)
    public String getRdpAddress() {
        return rdpAddress;
    }

    public void setRdpAddress(String rdpAddress) {
        this.rdpAddress = rdpAddress;
    }

    @Basic
    @Column(name = "RDPUserName", nullable = true, insertable = true, updatable = true)
    public String getRdpUserName() {
        return rdpUserName;
    }

    public void setRdpUserName(String rdpUserName) {
        this.rdpUserName = rdpUserName;
    }

    @Basic
    @Column(name = "RDPPassword", nullable = true, insertable = true, updatable = true)
    public String getRdpPassword() {
        return rdpPassword;
    }

    public void setRdpPassword(String rdpPassword) {
        this.rdpPassword = rdpPassword;
    }

    @Basic
    @Column(name = "connectionNotes", nullable = true, insertable = true, updatable = true)
    public String getConnectionNotes() {
        return connectionNotes;
    }

    public void setConnectionNotes(String connectionNotes) {
        this.connectionNotes = connectionNotes;
    }

    @Basic
    @Column(name = "active", nullable = false, insertable = true, updatable = true)
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationConnectionEntity that = (TranslationConnectionEntity) o;

        if (active != that.active) return false;
        if (connectionId != that.connectionId) return false;
        if (dataProviderId != that.dataProviderId) return false;
        if (connectionNotes != null ? !connectionNotes.equals(that.connectionNotes) : that.connectionNotes != null)
            return false;
        if (rdpAddress != null ? !rdpAddress.equals(that.rdpAddress) : that.rdpAddress != null) return false;
        if (rdpPassword != null ? !rdpPassword.equals(that.rdpPassword) : that.rdpPassword != null) return false;
        if (rdpUserName != null ? !rdpUserName.equals(that.rdpUserName) : that.rdpUserName != null) return false;
        if (vpnAddress != null ? !vpnAddress.equals(that.vpnAddress) : that.vpnAddress != null) return false;
        if (vpnClientType != null ? !vpnClientType.equals(that.vpnClientType) : that.vpnClientType != null)
            return false;
        if (vpnPassword != null ? !vpnPassword.equals(that.vpnPassword) : that.vpnPassword != null) return false;
        if (vpnUserName != null ? !vpnUserName.equals(that.vpnUserName) : that.vpnUserName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = connectionId;
        result = 31 * result + dataProviderId;
        result = 31 * result + (vpnClientType != null ? vpnClientType.hashCode() : 0);
        result = 31 * result + (vpnAddress != null ? vpnAddress.hashCode() : 0);
        result = 31 * result + (vpnUserName != null ? vpnUserName.hashCode() : 0);
        result = 31 * result + (vpnPassword != null ? vpnPassword.hashCode() : 0);
        result = 31 * result + (rdpAddress != null ? rdpAddress.hashCode() : 0);
        result = 31 * result + (rdpUserName != null ? rdpUserName.hashCode() : 0);
        result = 31 * result + (rdpPassword != null ? rdpPassword.hashCode() : 0);
        result = 31 * result + (connectionNotes != null ? connectionNotes.hashCode() : 0);
        result = 31 * result + (active ? 1 : 0);
        return result;
    }
}
