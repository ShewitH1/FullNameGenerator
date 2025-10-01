package com.pluralsight;

import java.util.Scanner;

public class FullNameGen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you first name:");
        String firstName = scanner.nextLine();
        firstName = firstName.trim();

        System.out.print("Enter your middle name:");
        String middleName = scanner.nextLine();
        middleName = middleName.trim();

        System.out.print("Enter you last name:");
        String lastName = scanner.nextLine();
        lastName = lastName.trim();

        System.out.print("Enter you suffix:");
        String suffix = scanner.nextLine();
        suffix = suffix.trim();

//        varibale with fullname as empty
        String fullName = " ";
//        middlename is empty just combine first and last names
        if (middleName.isEmpty()){
            fullName = firstName  + " " + lastName;
        }
//        if its not empty, combined first, middle, and last names
        else{
            fullName = firstName + " " + middleName + " " + lastName;

        }


//        suffix is not empty
        if(!suffix.isEmpty()){
            fullName = fullName + ", " + suffix;

        }

        System.out.println("Full Name: " + fullName);





//        System.out.println("First Name: " + firstName);
//        System.out.println("Middle Name: " + middleName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Suffix: " + suffix);


    }
}