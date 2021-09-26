/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex38;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    static char[] filterEvenNumbers(char[] arr, int n) {

        char[] arr2 = new char[n];
        Arrays.fill(arr2, ' ');

        for (int i = 0, j = 0; i < n; i++) {
            if (arr[i] == '2' | arr[i] == '4' | arr[i] == '6' | arr[i] == '8' | arr[i] == '0') {
                arr2[j] = arr[i];
                j++;
                j++;
                }
            }

        return arr2;
        }

    public static void main(String[] args) {

        System.out.print("Enter a list of numbers, separated by spaces: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        char[] arr1 = str.toCharArray();

        int n = arr1.length;

        System.out.print("The even numbers are ");
        System.out.print(filterEvenNumbers(arr1, n));
    }
}
