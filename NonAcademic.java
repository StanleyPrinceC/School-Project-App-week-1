package org.example;

public class NonAcademic {
    private String name;
    private  String location;
    private  String phoneNumber;
    private  int age;



    public NonAcademic(String name, String location, String phoneNumber, int age) {
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public NonAcademic(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>=19){
            System.out.println("congratulation you have being employed");
        }else {
            System.out.println("Sorry no slot available we will get back to you in due time");
        }
        this.age = age;
    }
}
