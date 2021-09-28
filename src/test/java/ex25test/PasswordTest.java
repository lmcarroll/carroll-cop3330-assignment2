/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex25test;

import ex25.Password;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordTest {

    @Test

    public void testPassword() {

        Password underTest = new Password();

        String str = "password123";

        int result = underTest.strRealNumCount(str);

        assertEquals(3, result);

        result = underTest.strLetterCount(str);

        assertEquals(8, result);

    }
}
