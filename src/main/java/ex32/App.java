/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex32;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class App {

    static void guessTheNumberGame() {

        while (true) {
            System.out.print("Let's play Guess the Number!\n\n");
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            int difficulty;
            Scanner input;

            while(true) {
                input = new Scanner(System.in);
                try {
                    difficulty = input.nextInt();
                    if (difficulty == 1 | difficulty == 2 | difficulty == 3) {
                        break;
                    } else {
                        System.out.println("Pardon?");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Pardon?");
                }
            }
            int max = 1;
            for (; difficulty >= 1; difficulty--) {
                max *= 10;
            }
            int theNumber = 0;
            while (theNumber == 0) {
                theNumber = (int) Math.floor(Math.random() * (max + 1));
            }
            System.out.print("I have my number. What's your guess? ");
            int guess = 0;
            int count = 0;
            while (guess != theNumber) {
                input = new Scanner(System.in);
                try {
                    guess = input.nextInt();

                    if (guess > theNumber) {
                        System.out.print("Too high. Guess again: ");
                    }

                    if (guess < theNumber) {
                        System.out.print("Too low. Guess again: ");
                    }

                } catch (InputMismatchException e) {
                    System.out.print("Non-numeric. Guess again: ");
                }
                count++;
            }

            System.out.print("You got it in " + count + " guesses!\n\n");

            System.out.print("Do you want to play again (Y/N)? ");
            boolean answer = false;
            while (!answer) {
                input = new Scanner(System.in);
                String playAgain = input.nextLine();

                if (playAgain.equals("N") | playAgain.equals("n")) {
                    return;
                }

                if (playAgain.equals("Y") | playAgain.equals("y")) {
                    answer = true;
                } else {
                    System.out.println("Pardon?");
                }
            }
        }
    }
    public static void main(String[] args) {
        guessTheNumberGame();
    }
}
