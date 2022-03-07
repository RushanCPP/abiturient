package com.example.abiturient.education;

import java.util.ArrayList;

public class User {
    private String fullName;
    private USE use;
    private ArrayList<Olympiad> olympiads;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setUse(USE use) {
        this.use = use;
    }

    public void setOlympiads(ArrayList<Olympiad> olympiads) {
        this.olympiads = olympiads;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Direction direction;
    private Location location;
    private AdmissionInterface admissionInterface;
    public User(String fullName, USE use,
                ArrayList<Olympiad> olympiads,
                Direction direction, Location location,
                AdmissionInterface admissionInterface) {
        this.direction = direction;
        this.fullName = fullName;
        this.use = use;
        this.olympiads = olympiads;
        this.location = location;
        this.admissionInterface = admissionInterface;
    }

    public Location getLocation() {
        return location;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public ArrayList<Olympiad> getOlympiads() {
        return olympiads;
    }

    public String getFullName() {
        return fullName;
    }

    public USE getUse() {
        return use;
    }

    public boolean canEnter(University university) {
        return admissionInterface.isAccepted(this, university);
    }
}
