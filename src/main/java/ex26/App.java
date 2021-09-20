/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex26;

import java.util.Scanner;
import java.lang.Math;

class PaymentCalculator {
    public double balance;
    public double APR;
    public double monthlyPayment;

    public double calculateMonthsUntilPayedOff(double balance, double APR, double monthlyPayment) {
        return -((double) 1/ (double) 30) * Math.log((double) 1+ (balance/monthlyPayment) * ((double) 1 -
                Math.pow((double) 1 + (APR/ (double) 36500), 30))) / Math.log((double) 1 + (APR / (double) 36500));
    }

}

public class App {
    public static void main(String[] args) {

        PaymentCalculator card = new PaymentCalculator();

        System.out.println("What is your balance?");
        Scanner input = new Scanner(System.in);
        card.balance = input.nextDouble();

        System.out.println("What is the APR on the card (as a percent)?");
        input = new Scanner(System.in);
        card.APR = input.nextDouble();

        System.out.println("What is the monthly payment you can make?");
        input = new Scanner(System.in);
        card.monthlyPayment = input.nextDouble();

        System.out.printf("It will take you %.0f months to pay off this card.",
                Math.ceil(card.calculateMonthsUntilPayedOff(card.balance, card.APR, card.monthlyPayment)));
    }
}
