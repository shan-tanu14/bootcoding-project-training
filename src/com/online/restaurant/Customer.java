package com.online.restaurant;

public class Customer {
    // To declare variable
    //datatype variablename
    private String name;
    private String address;
    private long phonenumeber;
    private String city;
    private String state;
    private String emailId;

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

    public long getPhonenumeber() {
        return phonenumeber;
    }

    public void setPhonenumeber(long phonenumeber) {
        this.phonenumeber = phonenumeber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
