package com.mvc.model;

import java.util.Date;

public class Student {

    private String name;
    private int age;
    private String gender;
    private int number;
    private String IdentityNumber;
    private Date birthday;
    private String schoolName;
    public Student(){

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
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getIdentityNumber() {
        return IdentityNumber;
    }
    public void setIdentityNumber(String identityNumber) {
        IdentityNumber = identityNumber;
    }
    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
