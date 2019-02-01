package com.company;

import java.util.List;

public class FyreAttendant {

    private String name;
    private String address;
    private String email;
    private String arrivalDate;
    private String specialRequests;

    public FyreAttendant(String name, String address, String email, String arrivalDate, String specialRequests) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.arrivalDate = arrivalDate;
        this.specialRequests = specialRequests;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Arrival Date: " + arrivalDate);
        System.out.println("Special Request: " + specialRequests);
    }





}
