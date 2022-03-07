package com.example.abiturient.education;

import java.net.URL;
import java.util.ArrayList;

public class University {
    private String name;
    private URL url;
    private int educationCost;
    private int scholarship;
    private Location location;
    private USE.Lesson[] lessonsUSE;
    private ArrayList<Olympiad> olympiads;
    private boolean dormitory;
    private boolean exam;

    public University() {}

    public University(String name, URL url, int educationCost, int scholarship,
                      Location location, USE.Lesson[] lessonsUSE,
                      ArrayList<Olympiad> olympiads, boolean dormitory, boolean exam) {
        this.name = name;
        this.url = url;
        this.educationCost = educationCost;
        this.scholarship = scholarship;
        this.location = location;
        this.lessonsUSE = lessonsUSE;
        this.olympiads = olympiads;
        this.dormitory = dormitory;
        this.exam = exam;
    }

    public boolean hasDormitory() {
        return dormitory;
    }

    public boolean hasExam() {
        return exam;
    }

    public int getEducationCost() {
        return educationCost;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public void setEducationCost(int educationCost) {
        this.educationCost = educationCost;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setLessonsUSE(USE.Lesson[] lessonsUSE) {
        this.lessonsUSE = lessonsUSE;
    }

    public void setOlympiads(ArrayList<Olympiad> olympiads) {
        this.olympiads = olympiads;
    }

    public void setDormitory(boolean dormitory) {
        this.dormitory = dormitory;
    }

    public void setExam(boolean exam) {
        this.exam = exam;
    }

    public Location getLocation() {
        return location;
    }

    public URL getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public USE.Lesson[] getUSELessons() {
        return lessonsUSE;
    }

    public ArrayList<Olympiad> getOlympiads() {
        return olympiads;
    }
}
