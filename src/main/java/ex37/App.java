/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex37;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class App {

    static void generatePassword(int min, int special, int numbers) {

        if (numbers + special > min / 2) {
            min = (numbers + special) * 2;
        }

        char[] letterList = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                            't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] numberList = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] specialList = {'!', '@', '#', '$', '%', '^', '&', '*'};

        List<Character> allChars = new ArrayList<>(min);

        for (int i = 0; i < min; i++) {
            if (special != 0) {
                allChars.add(specialList[(int) Math.floor(Math.random() * 8)]);
                special--;
            } else {
                if (numbers != 0) {
                    allChars.add(numberList[(int) Math.floor(Math.random() * 10)]);
                    numbers--;
                } else {
                    allChars.add(letterList[(int) Math.floor(Math.random() * 26)]);
                }
            }
        }

        System.out.print("Your password is ");
        for (int i = 0; i < min; i++) {
            System.out.print(allChars.get(i));
        }

    }

    public static void main(String[] args) {

        System.out.print("What's the minimum length? ");
        Scanner input = new Scanner(System.in);
        int min = input.nextInt();

        System.out.print("How many special characters? ");
        input = new Scanner(System.in);
        int special = input.nextInt();

        System.out.print("How many numbers? ");
        input = new Scanner(System.in);
        int numbers = input.nextInt();

        generatePassword(min, special, numbers);

    }
}
