package com.company;

import java.util.List;

public class FyreAttendant {

    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String email;
    private String arrivalDate;
    private String specialRequests;
    private double idNumber;

    public FyreAttendant(String name, String address, String city, String state, String zip  ,String email, String arrivalDate, String specialRequests) {
        this.name = name;
        this.address = address;
        this.city =  city;
        this.state = state;
        this.zip = zip;
        this.email = email;
        this.arrivalDate = arrivalDate;
        this.specialRequests = specialRequests;
        this.idNumber = Math.floor(Math.random() * 1000) + 1000000;
    }

    public double getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
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
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
        System.out.println("Arrival Date: " + arrivalDate);
        System.out.println("Special Request: " + specialRequests);
        System.out.println(idNumber);
    }





}
