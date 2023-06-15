package org.example;

public class Applicant {
    private  String  applicantName;
    private  String  address;
    private  String  phoneNumber;
    private String Dob;
    private  String courseOfStudy;
    private  String jambScore;
    private  int age;

    public Applicant(String applicantName, String address, String phoneNumber, String dob, String courseOfStudy, String jambScore, int age) {
        this.applicantName = applicantName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        Dob = dob;
        this.courseOfStudy = courseOfStudy;
        this.jambScore = jambScore;
        this.age = age;
    }

    public Applicant(){}

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public String getCourseOfStudy() {
        return courseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        this.courseOfStudy = courseOfStudy;
    }

    public String getJambScore() {
        return jambScore;
    }

    public void setJambScore(String jambScore) {
        this.jambScore = jambScore;
    }

    public int getAge() {
        if (age>=16){
            System.out.println("Congratulation welcome onboard!!!");
        }else {
            System.out.println("you failed try again next time ");
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantName='" + applicantName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", Dob='" + Dob + '\'' +
                ", courseOfStudy='" + courseOfStudy + '\'' +
                ", jambScore='" + jambScore + '\'' +
                ", age=" + age +
                '}';
    }
}
