/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex25test;

import ex25.PasswordStrengthIndicator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PasswordStrengthIndicatorTest {

@Test

    public void testPasswordStrengthIndicator() {

    PasswordStrengthIndicator underTest = new PasswordStrengthIndicator();

    String str = "password123";

    int result = underTest.passwordValidator(str);

    assertEquals(3, result);

}
}

