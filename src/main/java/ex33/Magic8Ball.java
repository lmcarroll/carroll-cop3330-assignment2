/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex33;

import java.util.Scanner;
import java.lang.Math;

public class Magic8Ball {
    static void magicEightBall() {
        String[] response = {"Yes.", "No.", "Ask again later."};

        System.out.println("What's your question?");
        Scanner input = new Scanner(System.in);
        String arbitrary = input.next();

        System.out.print(response[(int) Math.floor(Math.random() * (3))]);

    }

    public static void main(String[] args) {
        magicEightBall();
    }
}
