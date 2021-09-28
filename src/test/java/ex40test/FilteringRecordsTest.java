/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex40test;

import ex25.PasswordStrengthIndicator;
import ex40.FilteringRecords;
import org.junit.Test;

import java.util.logging.Filter;

import static org.junit.Assert.assertEquals;

public class FilteringRecordsTest {


    @Test

    public void testFilteringRecords() {

        FilteringRecords underTest = new FilteringRecords();

        String[] str = {"Jacquelyn Jackson", "Jake Jacobson", "John Johnson", "Michaela Michaelson", "Sally Webber", "Tou Xiong"};

        int[] result = underTest.searcher(str, "Jo");

        assertEquals(result, result);

    }
}
