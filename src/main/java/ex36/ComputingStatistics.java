/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex36;

import java.util.Scanner;
import java.lang.Math;

public class ComputingStatistics {

    public static float average(float[] numbers, int i) {

        float sum = 0;

        for (int j = 0; j < i; j++) {
            sum += numbers[j];
        }

        return sum / (float) i;
    }

    public static float min(float[] numbers, int i) {

        float minimum = numbers[0];

        for (int j = 0; j < i; j++) {
            if (numbers[j] < minimum) {
                minimum = numbers[j];
            }
        }

        return minimum;
    }

    public static float max(float[] numbers, int i) {

        float maximum = numbers[0];

        for (int j = 0; j < i; j++) {
            if (numbers[j] > maximum) {
                maximum = numbers[j];
            }
        }

        return maximum;
    }

    public static float std(float[] numbers, int i) {

        float sd = 0;
        float mean = average(numbers, i);

        for (int j = 0; j <= i-1; j++) {
            sd += Math.pow(numbers[j] - mean, 2);
        }

        return (float) Math.sqrt(sd / i);
    }

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

            if (rStr.equals("done")) {
                return rStr;
            }

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

    static void printArrayStats(float[] numbers, int i) {

        System.out.print("Numbers: ");
        for (int j = 0; j <= i - 1; j++) {
            System.out.printf("%.0f", numbers[j]);
            if (j != i - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("\nThe average is %.1f", average(numbers, i));
        System.out.printf("\nThe minimum is %.0f", min(numbers, i));
        System.out.printf("\nThe maximum is %.0f", max(numbers, i));
        System.out.printf("\nThe standard deviation is %.2f", std(numbers, i));

    }

    public static void main(String[] args) {

        float[] numbers = new float[100];
        int i = 0;

        while (true) {
            System.out.print("Enter a number: ");
            String numStr = badInput();
            if (numStr.equals("done")) {
                break;
            }
            numbers[i] = Float.parseFloat(numStr);

            i++;
        }

        printArrayStats(numbers, i);
    }
}
