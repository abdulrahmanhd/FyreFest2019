package com.company;

import java.util.Scanner;

public class FyreFestDemo {
    public static void main(String[] args) {

        Scanner numScanner = new Scanner(System.in);
        Scanner textScanner = new Scanner(System.in);
        int userIntInput1;
        String userTextInput;
        FyreAttendant attendant = new FyreAttendant();

        System.out.println("Welcome to Frye Fest Registration bruuuuuuh. Choose from the following option: ");
        System.out.println("1. Current Registrant " +
                "2. New Registrant" +
                "3. Admin Access ");

        userIntInput1 = numScanner.nextInt();

        switch(userIntInput1) {

            case 1:
                break;
            case 2:
                break;
            case 3:
                break;



                default:



        }

    }
}
