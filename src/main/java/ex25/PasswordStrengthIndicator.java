/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex25;

import java.util.Scanner;

public class PasswordStrengthIndicator {

    public static int passwordValidator(String str) {

        Password draft = new Password();

        if ((draft.strRealNumCount(str) == str.length()) && (str.length() < 8)) {
            return 1;
        } else {
            if ((draft.strLetterCount(str) == str.length()) && (str.length() < 8)) {
                return 2;
            } else {
                if ((draft.strRealNumCount(str) > 0) && (draft.strRealNumCount(str) +
                        draft.strLetterCount(str) == str.length()) && (str.length() >= 8)) {
                    return 3;
                } else {
                    if ((draft.strRealNumCount(str) > 0) && (draft.strLetterCount(str) > 0) &&
                            (draft.strRealNumCount(str) + draft.strLetterCount(str) != str.length()) &&
                            (str.length() >= 8)) {
                        return 4;
                    }
                }
            }
        }
        return 5;
    }

    public static void main(String[] args) {
        System.out.println("Enter a password proposal: ");
        Scanner input = new Scanner(System.in);
        String strDraft = input.nextLine();

        String strengthString = "NULL (does not meet all of any category specifications)";

        switch (passwordValidator(strDraft)) {
            case 1: strengthString = "very weak";
            break;
            case 2: strengthString = "weak";
            break;
            case 3: strengthString = "strong";
            break;
            case 4: strengthString = "very strong";
            break;
        }
        System.out.println("The password '" + strDraft + "' is a " + strengthString + " password.");
    }
}
