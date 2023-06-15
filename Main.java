package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        School school = new School("Stanley College","16th December 2023","Lagos State","Computer Engineering",45,"Dr Peter","30 staffs employed","15 non Academic staffs employed");
        Applicant applicant = new Applicant("John","Lagos","08168889426","20th May 2025","English language studies","250 grade",18);


       Course course = new Course("0087","Williams","Java stack ",54);

       NonAcademic nonAcademic = new NonAcademic("kings","aba","8765433",12);

        System.out.println(nonAcademic.getAge());

        System.out.println(course.toString());





    }
}