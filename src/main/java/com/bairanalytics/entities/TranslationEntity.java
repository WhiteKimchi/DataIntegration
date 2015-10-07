package com.bairanalytics.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@javax.persistence.Table(name = "translation", schema = "dbo", catalog = "DataIntegrationDB")
public class TranslationEntity {
    private int translationId;

    @Id
    @javax.persistence.Column(name = "translationID", nullable = false, insertable = true, updatable = true)
    public int getTranslationId() {
        return translationId;
    }

    public void setTranslationId(int translationId) {
        this.translationId = translationId;
    }

    private int dataProviderId;

    @Basic
    @javax.persistence.Column(name = "dataProviderID", nullable = false, insertable = true, updatable = true)
    public int getDataProviderId() {
        return dataProviderId;
    }

    public void setDataProviderId(int dataProviderId) {
        this.dataProviderId = dataProviderId;
    }

    private int moduleTypeId;

    @Basic
    @javax.persistence.Column(name = "moduleTypeID", nullable = false, insertable = true, updatable = true)
    public int getModuleTypeId() {
        return moduleTypeId;
    }

    public void setModuleTypeId(int moduleTypeId) {
        this.moduleTypeId = moduleTypeId;
    }

    private int translationTypeId;

    @Basic
    @javax.persistence.Column(name = "translationTypeID", nullable = false, insertable = true, updatable = true)
    public int getTranslationTypeId() {
        return translationTypeId;
    }

    public void setTranslationTypeId(int translationTypeId) {
        this.translationTypeId = translationTypeId;
    }

    private Integer translationDataSourceId;

    @Basic
    @javax.persistence.Column(name = "translationDataSourceID", nullable = true, insertable = true, updatable = true)
    public Integer getTranslationDataSourceId() {
        return translationDataSourceId;
    }

    public void setTranslationDataSourceId(Integer translationDataSourceId) {
        this.translationDataSourceId = translationDataSourceId;
    }

    private String rmsProvider;

    @Basic
    @javax.persistence.Column(name = "rmsProvider", nullable = false, insertable = true, updatable = true)
    public String getRmsProvider() {
        return rmsProvider;
    }

    public void setRmsProvider(String rmsProvider) {
        this.rmsProvider = rmsProvider;
    }

    private String hostServerName;

    @Basic
    @javax.persistence.Column(name = "hostServerName", nullable = true, insertable = true, updatable = true)
    public String getHostServerName() {
        return hostServerName;
    }

    public void setHostServerName(String hostServerName) {
        this.hostServerName = hostServerName;
    }

    private String hostServerLogin;

    @Basic
    @javax.persistence.Column(name = "hostServerLogin", nullable = true, insertable = true, updatable = true)
    public String getHostServerLogin() {
        return hostServerLogin;
    }

    public void setHostServerLogin(String hostServerLogin) {
        this.hostServerLogin = hostServerLogin;
    }

    private String hostServerPassword;

    @Basic
    @javax.persistence.Column(name = "hostServerPassword", nullable = true, insertable = true, updatable = true)
    public String getHostServerPassword() {
        return hostServerPassword;
    }

    public void setHostServerPassword(String hostServerPassword) {
        this.hostServerPassword = hostServerPassword;
    }

    private String sourceServerName;

    @Basic
    @javax.persistence.Column(name = "sourceServerName", nullable = true, insertable = true, updatable = true)
    public String getSourceServerName() {
        return sourceServerName;
    }

    public void setSourceServerName(String sourceServerName) {
        this.sourceServerName = sourceServerName;
    }

    private boolean isLinkedServer;

    @Basic
    @javax.persistence.Column(name = "isLinkedServer", nullable = false, insertable = true, updatable = true)
    public boolean isLinkedServer() {
        return isLinkedServer;
    }

    public void setLinkedServer(boolean isLinkedServer) {
        this.isLinkedServer = isLinkedServer;
    }

    private String sourceServerLogin;

    @Basic
    @javax.persistence.Column(name = "sourceServerLogin", nullable = true, insertable = true, updatable = true)
    public String getSourceServerLogin() {
        return sourceServerLogin;
    }

    public void setSourceServerLogin(String sourceServerLogin) {
        this.sourceServerLogin = sourceServerLogin;
    }

    private String sourceServerPassword;

    @Basic
    @javax.persistence.Column(name = "sourceServerPassword", nullable = true, insertable = true, updatable = true)
    public String getSourceServerPassword() {
        return sourceServerPassword;
    }

    public void setSourceServerPassword(String sourceServerPassword) {
        this.sourceServerPassword = sourceServerPassword;
    }

    private String sourceDatabaseName;

    @Basic
    @javax.persistence.Column(name = "sourceDatabaseName", nullable = true, insertable = true, updatable = true)
    public String getSourceDatabaseName() {
        return sourceDatabaseName;
    }

    public void setSourceDatabaseName(String sourceDatabaseName) {
        this.sourceDatabaseName = sourceDatabaseName;
    }

    private String sourceDatabaseLogin;

    @Basic
    @javax.persistence.Column(name = "sourceDatabaseLogin", nullable = true, insertable = true, updatable = true)
    public String getSourceDatabaseLogin() {
        return sourceDatabaseLogin;
    }

    public void setSourceDatabaseLogin(String sourceDatabaseLogin) {
        this.sourceDatabaseLogin = sourceDatabaseLogin;
    }

    private String sourceDatabasePassword;

    @Basic
    @javax.persistence.Column(name = "sourceDatabasePassword", nullable = true, insertable = true, updatable = true)
    public String getSourceDatabasePassword() {
        return sourceDatabasePassword;
    }

    public void setSourceDatabasePassword(String sourceDatabasePassword) {
        this.sourceDatabasePassword = sourceDatabasePassword;
    }

    private String packageName;

    @Basic
    @javax.persistence.Column(name = "packageName", nullable = true, insertable = true, updatable = true)
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    private String packageFileLocation;

    @Basic
    @javax.persistence.Column(name = "packageFileLocation", nullable = true, insertable = true, updatable = true)
    public String getPackageFileLocation() {
        return packageFileLocation;
    }

    public void setPackageFileLocation(String packageFileLocation) {
        this.packageFileLocation = packageFileLocation;
    }

    private String packagePassword;

    @Basic
    @javax.persistence.Column(name = "packagePassword", nullable = true, insertable = true, updatable = true)
    public String getPackagePassword() {
        return packagePassword;
    }

    public void setPackagePassword(String packagePassword) {
        this.packagePassword = packagePassword;
    }

    private Boolean translationCompleted;

    @Basic
    @javax.persistence.Column(name = "translationCompleted", nullable = true, insertable = true, updatable = true)
    public Boolean getTranslationCompleted() {
        return translationCompleted;
    }

    public void setTranslationCompleted(Boolean translationCompleted) {
        this.translationCompleted = translationCompleted;
    }

    private String translationNotes;

    @Basic
    @javax.persistence.Column(name = "translationNotes", nullable = true, insertable = true, updatable = true)
    public String getTranslationNotes() {
        return translationNotes;
    }

    public void setTranslationNotes(String translationNotes) {
        this.translationNotes = translationNotes;
    }

    private Timestamp addDate;

    @Basic
    @javax.persistence.Column(name = "addDate", nullable = false, insertable = true, updatable = true)
    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    private Timestamp modifyDate;

    @Basic
    @javax.persistence.Column(name = "modifyDate", nullable = false, insertable = true, updatable = true)
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

        TranslationEntity that = (TranslationEntity) o;

        if (dataProviderId != that.dataProviderId) return false;
        if (isLinkedServer != that.isLinkedServer) return false;
        if (moduleTypeId != that.moduleTypeId) return false;
        if (translationId != that.translationId) return false;
        if (translationTypeId != that.translationTypeId) return false;
        if (addDate != null ? !addDate.equals(that.addDate) : that.addDate != null) return false;
        if (hostServerLogin != null ? !hostServerLogin.equals(that.hostServerLogin) : that.hostServerLogin != null)
            return false;
        if (hostServerName != null ? !hostServerName.equals(that.hostServerName) : that.hostServerName != null)
            return false;
        if (hostServerPassword != null ? !hostServerPassword.equals(that.hostServerPassword) : that.hostServerPassword != null)
            return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (packageFileLocation != null ? !packageFileLocation.equals(that.packageFileLocation) : that.packageFileLocation != null)
            return false;
        if (packageName != null ? !packageName.equals(that.packageName) : that.packageName != null) return false;
        if (packagePassword != null ? !packagePassword.equals(that.packagePassword) : that.packagePassword != null)
            return false;
        if (rmsProvider != null ? !rmsProvider.equals(that.rmsProvider) : that.rmsProvider != null) return false;
        if (sourceDatabaseLogin != null ? !sourceDatabaseLogin.equals(that.sourceDatabaseLogin) : that.sourceDatabaseLogin != null)
            return false;
        if (sourceDatabaseName != null ? !sourceDatabaseName.equals(that.sourceDatabaseName) : that.sourceDatabaseName != null)
            return false;
        if (sourceDatabasePassword != null ? !sourceDatabasePassword.equals(that.sourceDatabasePassword) : that.sourceDatabasePassword != null)
            return false;
        if (sourceServerLogin != null ? !sourceServerLogin.equals(that.sourceServerLogin) : that.sourceServerLogin != null)
            return false;
        if (sourceServerName != null ? !sourceServerName.equals(that.sourceServerName) : that.sourceServerName != null)
            return false;
        if (sourceServerPassword != null ? !sourceServerPassword.equals(that.sourceServerPassword) : that.sourceServerPassword != null)
            return false;
        if (translationCompleted != null ? !translationCompleted.equals(that.translationCompleted) : that.translationCompleted != null)
            return false;
        if (translationDataSourceId != null ? !translationDataSourceId.equals(that.translationDataSourceId) : that.translationDataSourceId != null)
            return false;
        if (translationNotes != null ? !translationNotes.equals(that.translationNotes) : that.translationNotes != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = translationId;
        result = 31 * result + dataProviderId;
        result = 31 * result + moduleTypeId;
        result = 31 * result + translationTypeId;
        result = 31 * result + (translationDataSourceId != null ? translationDataSourceId.hashCode() : 0);
        result = 31 * result + (rmsProvider != null ? rmsProvider.hashCode() : 0);
        result = 31 * result + (hostServerName != null ? hostServerName.hashCode() : 0);
        result = 31 * result + (hostServerLogin != null ? hostServerLogin.hashCode() : 0);
        result = 31 * result + (hostServerPassword != null ? hostServerPassword.hashCode() : 0);
        result = 31 * result + (sourceServerName != null ? sourceServerName.hashCode() : 0);
        result = 31 * result + (isLinkedServer ? 1 : 0);
        result = 31 * result + (sourceServerLogin != null ? sourceServerLogin.hashCode() : 0);
        result = 31 * result + (sourceServerPassword != null ? sourceServerPassword.hashCode() : 0);
        result = 31 * result + (sourceDatabaseName != null ? sourceDatabaseName.hashCode() : 0);
        result = 31 * result + (sourceDatabaseLogin != null ? sourceDatabaseLogin.hashCode() : 0);
        result = 31 * result + (sourceDatabasePassword != null ? sourceDatabasePassword.hashCode() : 0);
        result = 31 * result + (packageName != null ? packageName.hashCode() : 0);
        result = 31 * result + (packageFileLocation != null ? packageFileLocation.hashCode() : 0);
        result = 31 * result + (packagePassword != null ? packagePassword.hashCode() : 0);
        result = 31 * result + (translationCompleted != null ? translationCompleted.hashCode() : 0);
        result = 31 * result + (translationNotes != null ? translationNotes.hashCode() : 0);
        result = 31 * result + (addDate != null ? addDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        return result;
    }
}
