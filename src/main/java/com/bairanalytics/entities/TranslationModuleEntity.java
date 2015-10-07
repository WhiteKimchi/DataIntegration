package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "translationModule", schema = "dbo", catalog = "DataIntegrationDB")
public class TranslationModuleEntity {
    private int moduleTypeId;
    private String moduleName;

    @Id
    @Column(name = "moduleTypeID", nullable = false, insertable = true, updatable = true)
    public int getModuleTypeId() {
        return moduleTypeId;
    }

    public void setModuleTypeId(int moduleTypeId) {
        this.moduleTypeId = moduleTypeId;
    }

    @Basic
    @Column(name = "moduleName", nullable = false, insertable = true, updatable = true)
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationModuleEntity that = (TranslationModuleEntity) o;

        if (moduleTypeId != that.moduleTypeId) return false;
        if (moduleName != null ? !moduleName.equals(that.moduleName) : that.moduleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = moduleTypeId;
        result = 31 * result + (moduleName != null ? moduleName.hashCode() : 0);
        return result;
    }
}
