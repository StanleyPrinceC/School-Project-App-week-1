package org.example;

public class TeachersServices extends Teachers{

    private String teachersDuties;
    private String teachduty;

    public TeachersServices(String teachersDuties) {
        this.teachersDuties = teachersDuties;
    }

    public TeachersServices(String teachersDuties, String teachduty) {
        this.teachersDuties = teachersDuties +"teacher teaches course to the student";
        this.teachduty = teachduty + "teachers handles affair and supervise students";
    }
}
