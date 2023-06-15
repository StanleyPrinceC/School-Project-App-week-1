package org.example;

public class Teachers {
    private String name;
    private String qualification;
    private int age;
    private String location;
    private String phoneNumber;
    private  String CourseOfStudy;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=35){
            System.out.println("Congratulation you're employed");
        }else{
            System.out.println("Sorry you're not up to the requirement");
        }
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCourseOfStudy() {
        return CourseOfStudy;
    }

    public void setCourseOfStudy(String courseOfStudy) {
        CourseOfStudy = courseOfStudy;
    }
}
