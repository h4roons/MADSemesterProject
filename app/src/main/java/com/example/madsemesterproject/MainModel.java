package com.example.madsemesterproject;

public class MainModel {

    String name,email,rollno,surl;

    MainModel()
    {

    }

    public MainModel(String name, String email, String rollno, String surl) {
        this.name = name;
        this.email = email;
        this.rollno = rollno;
        this.surl = surl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getSurl() {
        return surl;
    }

    public void setSurl(String surl) {
        this.surl = surl;
    }
}
