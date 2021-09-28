/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex38test;

import ex38.FilteringValues;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilteringValuesTest {

    @Test

    public void testPasswordStrengthIndicator() {

        FilteringValues underTest = new FilteringValues();

        char[] arr = {1, 2, 3, 4, 5};

        char[] result = underTest.filterEvenNumbers(arr, 5);

        char[] arr2 = {2, 4};

        assertEquals(result, result);

    }
}
