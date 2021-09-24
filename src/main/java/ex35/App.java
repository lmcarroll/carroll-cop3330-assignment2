/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex35;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static void pickingAWinner() {
        ArrayList<String> contestants = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            if (name.equals("")) {
                break;
            }
            contestants.add(name);
        }

        System.out.println("The winner is... " + contestants.get((int) Math.floor(Math.random() * (contestants.size()))) + ".");
    }

    public static void main(String[] args) {

        pickingAWinner();
    }
}
