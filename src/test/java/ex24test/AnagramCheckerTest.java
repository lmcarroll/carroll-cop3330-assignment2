/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex24test;

import ex24.AnagramChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramCheckerTest {

    @Test

    public void testIsAnagram() {

        AnagramChecker underTest = new AnagramChecker();

        String str1 = "earth";
        String str2 = "heart";

        boolean result = underTest.isAnagram(str1, str2);

        assertEquals(true, result);

    }
}
