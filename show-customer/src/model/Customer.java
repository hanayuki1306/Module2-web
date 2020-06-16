package model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private String address;
    private String birthday;
    public String urlImage;


    public Customer() {
    }

    public Customer(String name, String address, String birthday, String urlImage) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.urlImage = urlImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}