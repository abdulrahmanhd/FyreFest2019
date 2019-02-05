package com.company;

import java.util.Iterator;

public class FyreAdmin {

    private void deleteAttendant(RegistrationInfo myRegistration, double userInputIDNumber) {

        Iterator<FyreAttendant> elementIterator = myRegistration.attendeesRegistrationArray.iterator();
        while(elementIterator.hasNext()) {
            myRegistration.attendeesRegistrationArray =
//        for (FyreAttendant element : myRegistration.attendeesRegistrationArray) {
//            if( element.getIdNumber() == userInputIDNumber){
//                System.out.println("We Found YOur Info");
//                element.printDetails();
//            }else
//                System.out.println("Your not Registered");


        }
    }
}
