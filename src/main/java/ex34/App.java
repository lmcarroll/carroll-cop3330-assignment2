/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex34;

import java.util.Scanner;

public class App {

    static String[] listRemover(String[] arr) {

        String[] newArr = new String[arr.length - 1];

        System.out.print("\nEnter an employee name to remove: ");
        Scanner input = new Scanner(System.in);
        String can = input.nextLine();

        boolean forNoError = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(can)) {
                arr[i] = "0";
                forNoError = true;
                break;
            }
        }

        if (!forNoError) {
            System.out.println("\nERROR: Employee '" + can + "' is not on the list.");
            return arr;
        }

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (!arr[i].equals("0")) {
                newArr[j] = arr[i];
                j++;
            }
        }

        return newArr;
    }

    static void printList(String[] arr) {

        System.out.println ("\nThere are " + arr.length + " employees:");

        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        String[] employees = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        printList(employees);

        String[] revisedEmployees = listRemover(employees);

        printList(revisedEmployees);
    }
}
