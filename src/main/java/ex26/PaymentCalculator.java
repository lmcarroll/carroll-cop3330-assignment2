/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex26;

public class PaymentCalculator {
    public double balance;
    public double APR;
    public double monthlyPayment;

    public double calculateMonthsUntilPayedOff(double balance, double APR, double monthlyPayment) {
        return -((double) 1 / (double) 30) * Math.log((double) 1 + (balance / monthlyPayment) * ((double) 1 -
                Math.pow((double) 1 + (APR / (double) 36500), 30))) / Math.log((double) 1 + (APR / (double) 36500));
    }

}
