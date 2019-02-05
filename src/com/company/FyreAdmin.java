package com.company;

import java.util.Iterator;
import java.util.Scanner;

public class FyreAdmin {
    Scanner scan = new Scanner(System.in);
    int userIndexInput;
    int adminMenu;
    String adminAccess;

    public void adminOptions(){
//        System.out.println("Please enter your admin password");
//        adminAccess = scan.nextLine();
//
//        if (adminAccess.equals("VillaLife") || adminAccess.equals("billy4eva") || adminAccess.equals("JaRule")){
//
//            System.out.println("Welcome Billy, Andy, and team. What would you like to do? \n");
//            System.out.println("Press [1] view all Registrants \n \n" +
//                    "Press [2] Look up attendee by ID or State \n \n" +
//                    "Press [3] Cancel an attendant's registration \n \n" +
//                    "Press [4] Assign VIP Access \n \n");
//
//            adminMenu = scan.nextInt();
//
//            switch (adminMenu) {
//
//                case 1:
//                    seeAllAttendants();
//
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//            }
//
//        }
//
//
//
//    }

    RegistrationInfo rI = new RegistrationInfo();

    public void seeAllAttendants () {
        rI.seeAllAttendants();

    }


    public void deleteAttendant(RegistrationInfo myRegistration) {
        System.out.println("Which item do you want delete");
        for (int i = 0; i < myRegistration.attendeesRegistrationArray.size(); i++) {
            System.out.print("[" + i + "] ");
            System.out.println(myRegistration.attendeesRegistrationArray.get(i).getName());
            System.out.println(myRegistration.attendeesRegistrationArray.get(i).getIdNumber());
            System.out.println("\n");

        }
        System.out.println("Enter the number of Antendee you want to delete");
        userIndexInput = scan.nextInt();
        myRegistration.attendeesRegistrationArray.remove(userIndexInput);
        System.out.println("Your person have been deleted");

    }



        }

