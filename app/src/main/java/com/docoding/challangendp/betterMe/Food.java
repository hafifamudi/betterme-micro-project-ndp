package com.docoding.challangendp.betterMe;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Food implements Serializable {
    private String name;
    private int photo;
    private String detail;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

}
