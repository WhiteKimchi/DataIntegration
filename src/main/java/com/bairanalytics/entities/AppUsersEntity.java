package com.bairanalytics.entities;

import javax.persistence.*;

/**
 * Created by Sean on 7/18/2015.
 */


@Entity
@Table(name = "appUsers", schema = "dbo", catalog = "DataIntegrationDB")
public class AppUsersEntity {
    private int userId;
    private String lastName;
    private String firstName;
    private String email;
    private String password;
    private int affiliation;
    private boolean administrator;

    @Id
    @Column(name = "userID", nullable = false, insertable = true, updatable = true)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "lastName", nullable = false, insertable = true, updatable = true)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "firstName", nullable = false, insertable = true, updatable = true)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "email", nullable = false, insertable = true, updatable = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "affiliation", nullable = false, insertable = true, updatable = true)
    public int getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(int affiliation) {
        this.affiliation = affiliation;
    }

    @Basic
    @Column(name = "administrator", nullable = false, insertable = true, updatable = true)
    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AppUsersEntity that = (AppUsersEntity) o;

        if (administrator != that.administrator) return false;
        if (affiliation != that.affiliation) return false;
        if (userId != that.userId) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + affiliation;
        result = 31 * result + (administrator ? 1 : 0);
        return result;
    }
}
