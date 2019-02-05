package com.company;

import java.util.ArrayList;
import java.util.List;

public class Search {


    public void searchByID(RegistrationInfo myRegistration, double userInputIDNumber) {

        for (FyreAttendant attendant : myRegistration.attendeesRegistrationArray) {
            if (attendant.getIdNumber() == userInputIDNumber) {
                System.out.println("We Found YOur Info");
                attendant.printDetails();

            } else
                System.out.println("Your not Registered");


        }

    }

    public void searchByState(RegistrationInfo myRegistration, String stateName) {

        List<FyreAttendant> foundAttendant = new ArrayList<>();


        for (FyreAttendant attendant : myRegistration.attendeesRegistrationArray) {
            if (attendant.getState().equalsIgnoreCase(stateName)) {
                foundAttendant.add(attendant);

//                System.out.println("We Found YOur Info");
//                attendant.printDetails();
            }

        }


        if (foundAttendant.isEmpty()) {
            System.out.println("No one is registered in that state");
        }else {
            for (FyreAttendant foundByState: foundAttendant) {
                System.out.println("Here is what we found: ");
                foundByState.printDetails();
            }

        }


    }
}
