package com.company;

import java.util.ArrayList;
import java.util.List;

public class RegistrationInfo {

    List<FyreAttendant>attendeesRegistrationArray = new ArrayList();

    public void seeAllAttendants() {
        for(FyreAttendant allAttendees: attendeesRegistrationArray){
            allAttendees.printDetails();

        }
    }


}
