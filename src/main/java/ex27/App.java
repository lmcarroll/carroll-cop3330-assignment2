/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex27;

import java.util.Scanner;

class Employee {
    public String firstName;
    public String lastName;
    public String ZIP;
    public String ID;

    public void validateInput(String firstName, String lastName, String ZIP, String ID) {
        if (
        !validateFirstName(firstName) &
        !validateLastName(lastName) &
        !validateZIP(ZIP) &
        !validateID(ID)) {
            System.out.println("There were no errors found.");
        }
    }

    public boolean validateFirstName(String firstName) {
        boolean result = false;

        if (firstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.");
            result = true;
        }
        if (firstName.length() == 0) {
            System.out.println("The first name must be filled in.");
        }

        return result;
    }

    public boolean validateLastName(String lastName) {
        boolean result = false;

        if (lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.");
            result = true;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
        }
        return result;
    }

    public boolean validateZIP(String ZIP) {
        if (ZIP.length() != 5) {
            System.out.println("The zipcode must be a 5 digit number.");
            return true;
        }
        for (int i = 0; i < ZIP.length(); i++) {
            if (ZIP.charAt(i) < '0' || ZIP.charAt(i) > '9') {
                System.out.println("The zipcode must be a 5 digit number.");
                return true;
            }
        }
        return false;
    }

    public boolean validateID(String ID) {
        if (
            Character.isLetter(ID.charAt(0)) &&
            Character.isLetter(ID.charAt(1)) &&
            ID.charAt(2) == '-' &&
            Character.isDigit(ID.charAt(3)) &&
            Character.isDigit(ID.charAt(4)) &&
            Character.isDigit(ID.charAt(5)) &&
            Character.isDigit(ID.charAt(6))) {
            return false;
        } else {
            System.out.println("The employee ID must be in the format AA-1234.");
            return true;
        }
    }
}
public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Enter the first name: ");
        Scanner input = new Scanner(System.in);
        employee.firstName = input.nextLine();

        System.out.println("Enter the last name: ");
        input = new Scanner(System.in);
        employee.lastName = input.nextLine();

        System.out.println("Enter the ZIP code: ");
        input = new Scanner(System.in);
        employee.ZIP = input.nextLine();

        System.out.println("Enter the employee ID: ");
        input = new Scanner(System.in);
        employee.ID = input.nextLine();

        employee.validateInput(employee.firstName, employee.lastName, employee.ZIP, employee.ID);
    }
}
