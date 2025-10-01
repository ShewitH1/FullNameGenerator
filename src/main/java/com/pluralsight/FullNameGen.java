package com.pluralsight;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        String fullName = "";
        if (middleName.isEmpty()){
            fullName = firstName + ' ' + ' ' + lastName;

        }
        else{
            fullName = firstName + ' ' + middleName + ' ' + lastName;

        }
        System.out.println("Full Name: " + fullName);

        if(suffix.isEmpty()){

        } else{
            fullName = firstName + ", " + suffix;
        }
        System.out.println("Full Name: " + fullName);





//        System.out.println("First Name: " + firstName);
//        System.out.println("Middle Name: " + middleName);
//        System.out.println("Last Name: " + lastName);
//        System.out.println("Suffix: " + suffix);


    }
}