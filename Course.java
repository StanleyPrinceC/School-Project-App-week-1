package org.example;

public class Course {
    private String studentId;
    private  String name;
    private String department;
    private int age;

    public Course(String studentId, String name, String department, int age) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.age = age;
    }

    public Course(){}

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Course{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
