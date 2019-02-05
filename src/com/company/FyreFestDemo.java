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
        String userCityInput;
        String userStateInput;
        String userZipInput;
        String userEmail;
        String userArrivalDate;
        String userSpecialRequests;
        double idSearch;

        RegistrationInfo attendeesRegistration = new RegistrationInfo();
        FyreAdmin admin = new FyreAdmin();
        Search fyreSearch = new Search();
        boolean again = false;

        //Admin Stuff
        Scanner scan = new Scanner(System.in);
        int userIndexInput;
        int adminMenu;
        int search;
        String adminAccess;
        String searchState;

        do {
            System.out.println("Welcome to Frye Fest Registration bruuuuuuh. Choose from the following option: \n");
            System.out.println("Press [1] for registration status \n \n" +
                    "Press [2] New Registrant \n \n" +
                    "Press [3] Admin Access ");

            userIntInput1 = numScanner.nextInt();

            switch (userIntInput1) {

                case 1:
                    System.out.println("Enter Id number");
                    idSearch = numScanner.nextDouble();

                    fyreSearch.searchByID(attendeesRegistration, idSearch);
                    break;

                case 2:
                    System.out.println("Welcome to the first step of making your dreams come true:" +
                            " \n Please enter your first and last name: ");

                    userNameInput = textScanner.nextLine();

                    System.out.println("Address: ");
                    userAddressInput = textScanner.nextLine();

                    System.out.println("City: ");
                    userCityInput = textScanner.nextLine();

                    System.out.println("State: ");
                    userStateInput = textScanner.nextLine();

                    System.out.println("Zip: ");
                    userZipInput = textScanner.nextLine();

                    System.out.println("Email: ");
                    userEmail = textScanner.nextLine();

                    System.out.println("Arrival Date: ");
                    userArrivalDate = textScanner.nextLine();

                    System.out.println("Special Requests: ");
                    userSpecialRequests = textScanner.nextLine();

                    FyreAttendant attendant = new FyreAttendant(userNameInput, userAddressInput, userCityInput, userStateInput, userZipInput, userEmail, userArrivalDate, userSpecialRequests);

                    attendeesRegistration.attendeesRegistrationArray.add(attendant);
//
//                    attendeesRegistration.seeAllAttendants();


                    break;


                case 3:
                    System.out.println("Please enter your admin password");
                    adminAccess = textScanner.nextLine();

                    if (adminAccess.equals("VillaLife") || adminAccess.equals("billy4eva") || adminAccess.equals("JaRule")){

                        System.out.println("Welcome Billy, Andy, and team. What would you like to do? \n");
                        System.out.println("Press [1] view all Registrants \n \n" +
                                "Press [2] Look up attendee by ID or State \n \n" +
                                "Press [3] Cancel an attendant's registration \n \n" +
                                "Press [4] Assign VIP Access \n \n");

                        adminMenu = numScanner.nextInt();

                        switch (adminMenu) {

                            case 1:
                                admin.seeAllAttendants(attendeesRegistration);
                                break;
                            case 2:

                                System.out.println("Would you like to search by: \n" +
                                        "Press [1] ID Number \n" +
                                        "Press [2] State ");
                                search = numScanner.nextInt();

                                if (search == 1) {
                                    System.out.println("Please enter the ID number: ");
                                    search = numScanner.nextInt();
                                    fyreSearch.searchByID(attendeesRegistration,search);

                                }else if(search == 2){
                                    System.out.println("Please enter state abbreviation");
                                  searchState   = textScanner.nextLine();
                                  fyreSearch.searchByState(attendeesRegistration, searchState);
                                }


                                break;
                            case 3:
                                admin.deleteAttendant(attendeesRegistration);
                                break;
                            case 4:
                                break;
                        }

                    }



                    break;
                case 4:
                    admin.deleteAttendant(attendeesRegistration);

                    break;



                default:


            }

            System.out.println("Would you like to start over? 1. Yes 2. No");
            userIntInput1 = numScanner.nextInt();

            if (userIntInput1 == 1) {
                again = true;

            } else {
                again = false;
            }

        }   while(again);


    }
}
