package org.example;

public class PrincipalServices implements Principal{

    @Override
    public void displayInformation() {
        System.out.println("Principal Admits students based on age.");
        System.out.println("Principal Expels");
    }

    @Override
    public void makeAnnouncement(String message) {

    }

}
