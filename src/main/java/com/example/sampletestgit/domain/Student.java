package com.example.sampletestgit.domain;

public class Student {


    public String name;
    public String school;
    public String address;

    public Student(String name, String school, String address) {
        this.name = name;
        this.school = school;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
