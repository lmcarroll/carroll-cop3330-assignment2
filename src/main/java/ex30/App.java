/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex30;

public class App {

    public static void printMultiplicationChart() {
        int num;

        for (int i = 1; i <= 12; i++) {
            for (int n = 1; n <= 12; n++) {
                num = i * n;
                System.out.printf("%4d", num);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        printMultiplicationChart();
    }
}
