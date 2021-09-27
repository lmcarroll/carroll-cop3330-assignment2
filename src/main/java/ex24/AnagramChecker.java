/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex24;

import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();

        System.out.println("Enter the second string: ");
        input = new Scanner(System.in);
        String str2 = input.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("\"" + str1 + "\" and " + "\"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and " + "\"" + str2 + "\" are not anagrams.");
        }
    }
}
