package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "translationType", schema = "dbo", catalog = "DataIntegrationDB")
public class TranslationTypeEntity {
    private int typeId;
    private String typeName;

    @Id
    @Column(name = "typeID", nullable = false, insertable = true, updatable = true)
    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
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

        TranslationTypeEntity that = (TranslationTypeEntity) o;

        if (typeId != that.typeId) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
