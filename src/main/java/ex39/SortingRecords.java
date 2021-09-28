/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex39;

import java.util.Arrays;

public class SortingRecords {

    static void printAlphabetical(Records[] arr) {

        System.out.printf("%-20s| %-17s| %-10s\n", "Name", "Position", "Separation Date");
        System.out.println("--------------------|------------------|----------------");
        for (Records records : arr) {
            records.printRecords();
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
        printAlphabetical(arr);
    }
}
