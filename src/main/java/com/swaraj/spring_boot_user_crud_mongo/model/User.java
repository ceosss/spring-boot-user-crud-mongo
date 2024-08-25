package com.swaraj.spring_boot_user_crud_mongo.model;

import java.time.LocalDate;

public class User {
    long id;
    String name;
    int age;
    String gender;
    LocalDate dob;

    public User() {
    }

    public User(String name, int age, String gender, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
}
