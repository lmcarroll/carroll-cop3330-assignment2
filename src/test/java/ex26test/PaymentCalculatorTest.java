/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex26test;

import ex26.PaymentCalculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaymentCalculatorTest {

    @Test

    public void testPaymentCalculator() {

        ex26.PaymentCalculator underTest = new PaymentCalculator();

        double a = 5000, b = 12, c = 100;

        double result = underTest.calculateMonthsUntilPayedOff(a, b, c);

        assertEquals(70, result, 1);
    }
}
