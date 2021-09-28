/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex31;

import java.util.Scanner;

public class KarvonenHeartRate {

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

    static void printHRChart(float age, float RHR) {
        System.out.printf("Resting pulse: %.0f        Age: %.0f\n\n", RHR, age);
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        float BPM;
        for(float i = 55; i <= 95; i += 5) {
            BPM = (((220 - age) - RHR) * i / 100) + RHR;
            System.out.printf("%.0f%%          | %.0f bpm\n", i, BPM);
        }
    }

    public static void main(String[] args) {
        System.out.println("What is your age?");
        float age = Float.parseFloat(badInput());

        System.out.println("What is your resting heart rate?");
        float RHR = Float.parseFloat(badInput());

        printHRChart(age, RHR);

    }
}
