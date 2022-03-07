package com.example.abiturient.education;

public class Location {
    private String city;
    private String street;
    private int house;
    public Location(String city, String street, int house) {
        this.city = city;
        this.house = house;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public int getHouse() {
        return house;
    }

    public String getStreet() {
        return street;
    }
}
