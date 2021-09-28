/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex27test;

import ex27.Employee;
import org.junit.Test;
import static org.junit.Assert.assertFalse;

public class EmployeeTest {

    @Test

    public void testEmployee() {

        Employee underTest = new Employee();

        boolean result = underTest.validateFirstName("John");

        assertFalse(result);

        result = underTest.validateLastName("Johnson");

        assertFalse(result);

        result = underTest.validateZIP("12345");

        assertFalse(result);

        result = underTest.validateID("AA-1234");

        assertFalse(result);
    }
}
