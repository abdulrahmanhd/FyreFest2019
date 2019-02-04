package com.company;

import java.util.Scanner;

public class FyreFestDemo {
    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        int userIntInput1;
        String userTextInput;

        String userNameInput;
        String userAddressInput;
        String userEmail;
        String userArrivalDate;
        String userSpecialRequests;

        RegistrationInfo attendeesRegistration = new RegistrationInfo();
        boolean again = false;

        do {
            System.out.println("Welcome to Frye Fest Registration bruuuuuuh. Choose from the following option: ");
            System.out.println("1. Current Registrant " +
                    "2. New Registrant" +
                    " 3. Admin Access ");

            userIntInput1 = numScanner.nextInt();

            switch (userIntInput1) {

                case 1:
                    System.out.println("C1");
                    break;

                case 2:
                    System.out.println("Welcome to the first step of making your dreams come true:" +
                            " \n Please enter your first and last name: ");

                    userNameInput = textScanner.nextLine();

                    System.out.println("Address: ");

                    userAddressInput = textScanner.nextLine();

                    System.out.println("Email: ");
                    userEmail = textScanner.nextLine();

                    System.out.println("Arrival Date: ");
                    userArrivalDate = textScanner.nextLine();

                    System.out.println("Special Requests: ");
                    userSpecialRequests = textScanner.nextLine();

                    FyreAttendant attendant = new FyreAttendant(userNameInput, userAddressInput, userEmail, userArrivalDate, userSpecialRequests);

//              attendant.printDetails();
                    System.out.println("----------------------------------------------");
                    attendeesRegistration.attendeesRegistrationArray.add(attendant);

                    attendeesRegistration.seeAllAttendants();

                    break;


                case 3:
                    break;


                default:


            }

            System.out.println("Would you like to add another person? 1. Yes 2. No");
            userIntInput1 = numScanner.nextInt();

            if (userIntInput1 == 1) {
                again = true;
    
            } else {
                again = false;
            }

        }   while(again);


    }
}
