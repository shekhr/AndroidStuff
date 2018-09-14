package com.mycodelabs.jsonparsing;

/**
 * Created by shekhar on 22-Jun-16.
 */
public class Contact {
    private String   contacts ;
    private String   id ;
    private String   name ;
    private String   email ;
    private String   address ;
    private String   gender ;
    private String   phone ;
    private String   mobile ;
    private String   home ;
    private String   office ;

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacts() {
        return contacts;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getHome() {
        return home;
    }

    public String getOffice() {
        return office;
    }
}
