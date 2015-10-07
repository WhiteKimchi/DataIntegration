package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 3/25/2015.
 */
@Entity
@Table(name = "translationDataSource", schema = "dbo", catalog = "DataIntegrationDB")
public class TranslationDataSourceEntity {
    private int sourceId;
    private String sourceName;

    @Id
    @Column(name = "sourceID", nullable = false, insertable = true, updatable = true)
    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    @Basic
    @Column(name = "sourceName", nullable = true, insertable = true, updatable = true)
    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TranslationDataSourceEntity that = (TranslationDataSourceEntity) o;

        if (sourceId != that.sourceId) return false;
        if (sourceName != null ? !sourceName.equals(that.sourceName) : that.sourceName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sourceId;
        result = 31 * result + (sourceName != null ? sourceName.hashCode() : 0);
        return result;
    }
}
