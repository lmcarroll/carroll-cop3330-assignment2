/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex27;

import java.util.Scanner;

public class ValidatingInputs {
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
