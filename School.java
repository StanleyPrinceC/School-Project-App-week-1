package org.example;

import java.util.Arrays;

public class School {
    private String name;
    private String dob;
    private  String address;
    private  String courseOfStudy;
    private  int age;
    private String headOfSchool;
    private String staffsEmployed;
    private String nonAcademicStaffEmployed;

    public School(String name, String dob, String address, String courseOfStudy, int age, String headOfSchool, String staffsEmployed, String nonAcademicStaffEmployed) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.courseOfStudy = courseOfStudy;
        this.age = age;
        this.headOfSchool = headOfSchool;
        this.staffsEmployed = staffsEmployed;
        this.nonAcademicStaffEmployed = nonAcademicStaffEmployed;
    }
    public School(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHeadOfSchool() {
        return headOfSchool;
    }

    public void setHeadOfSchool(String headOfSchool) {
        this.headOfSchool = headOfSchool;
    }

    public String getStaffsEmployed() {
        return staffsEmployed;
    }

    public void setStaffsEmployed(String staffsEmployed) {
        this.staffsEmployed = staffsEmployed;
    }

    public String getNonAcademicStaffEmployed() {
        return nonAcademicStaffEmployed;
    }

    public void setNonAcademicStaffEmployed(String nonAcademicStaffEmployed) {
        this.nonAcademicStaffEmployed = nonAcademicStaffEmployed;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", courseOfStudy='" + courseOfStudy + '\'' +
                ", age=" + age +
                ", headOfSchool='" + headOfSchool + '\'' +
                ", staffsEmployed='" + staffsEmployed + '\'' +
                ", nonAcademicStaffEmployed='" + nonAcademicStaffEmployed + '\'' +
                '}';
    }
}
