package com.company;

import java.util.List;

public class Search {


    public void searchByID(RegistrationInfo myRegistration, double userInputIDNumber) {
       for (FyreAttendant attendant : myRegistration.attendeesRegistrationArray) {
          if( attendant.getIdNumber() == userInputIDNumber){
              System.out.println("We Found YOur Info");
             attendant.printDetails();
          }else
           System.out.println("Your not Registered");


        }
    }
}
