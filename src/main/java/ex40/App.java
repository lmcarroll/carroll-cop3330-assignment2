/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex40;

import java.util.Scanner;

public class App {

    static int[] searcher(String[] str, String search) {

        int[] matchIndex = new int[6];

        for (int i = 0; i < str.length; i++) {
            here:
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == search.charAt(0)) {
                    for (int k = 0; k < search.length(); k++) {
                        if (str[i].charAt(j + k) != search.charAt(k)) {
                            break here;
                        }
                        if (k == search.length() - 1) {
                            matchIndex[i] = 1;
                            break here;
                        }
                    }
                }
            }
        }

        return matchIndex;
    }

    static void printAlphabetical(Records[] arr, int[] matchIndex) {
        System.out.println("\nResults:\n");
        System.out.printf("%-20s| %-17s| %-10s\n", "Name", "Position", "Separation Date");
        System.out.println("--------------------|------------------|----------------");
        int i = 0;
        for (Records records : arr) {
            if (matchIndex[i] == 1) {
                records.printRecords();
            }
            i++;
        }
    }

    public static void main(String[] args) {

        Records johnson = new Records("John", "Johnson", "Manager", "2016-12-31");
        Records xiong = new Records("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Records michaelson = new Records("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Records jacobson = new Records("Jake", "Jacobson", "Programmer", "");
        Records jackson = new Records("Jacquelyn", "Jackson", "DBA", "");
        Records webber = new Records("Sally", "Webber", "Web Developer", "2015-12-18");
        Records[] arr = {jackson, jacobson, johnson, michaelson, webber, xiong};
        String[] str = {"Jacquelyn Jackson", "Jake Jacobson", "John Johnson", "Michaela Michaelson", "Sally Webber", "Tou Xiong"};

        System.out.print("Enter a search string: ");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();

        int[] matchIndex = searcher(str, search);

        printAlphabetical(arr, matchIndex);
    }
}
