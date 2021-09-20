/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex29;

import java.util.Scanner;

public class App {
    static String badInput() {
        String rStr = "notDigit";
        Scanner input;
        int i;
        boolean state = false;
        boolean state2;

        while (!state) {
            state2 = false;

            input = new Scanner(System.in);
            rStr = input.nextLine();

            for (i = 0; i < rStr.length(); i++) {
                if (!Character.isDigit(rStr.charAt(i))) {
                    state2 = true;
                    System.out.println("Sorry. That's not a valid input.");
                    break;
                }
            }
            if (!state2) {
                state = true;
            }
        }
        return rStr;
    }
    public static void main(String[] args) {
        System.out.println("What is the rate of return?");

        float r = Float.parseFloat(badInput());
        float years = (float) 72 / r;

        System.out.printf("It will take %.0f years to double your initial investment.", years);
    }
}
