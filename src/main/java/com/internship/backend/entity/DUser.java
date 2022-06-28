package com.internship.backend.entity;

import java.io.Serializable;

public class DUser implements Serializable {

    private int id;
    private String UName;
    private String UPassword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName;
    }

    public String getUPassword() {
        return UPassword;
    }

    public void setUPassword(String UPassword) {
        this.UPassword = UPassword;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", UName='" + UName + '\'' +
                ", UPassword='" + UPassword + '\'' +
                '}';
    }
}
