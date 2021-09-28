/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex28;

import java.util.Scanner;

public class AddingNumbers {

    public static int addingNum() {

        Scanner input;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            input = new Scanner(System.in);
            sum += input.nextInt();
        }

        return sum;
    }
    public static void main(String[] args) {

        System.out.println("The total is " + addingNum() + ".");
    }
}
