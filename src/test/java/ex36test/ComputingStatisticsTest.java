/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex36test;

import ex36.ComputingStatistics;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputingStatisticsTest {

        @Test

        public void testComputingStatistics() {

            ComputingStatistics underTest = new ComputingStatistics();

            float[] arr = {1, 2, 3};

            float result = underTest.average(arr, 3);

            assertEquals("2.0", (String.valueOf(result)));

            result = underTest.min(arr, 3);

            assertEquals("1.0", (String.valueOf(result)));

            result = underTest.max(arr, 3);

            assertEquals("3.0", (String.valueOf(result)));

            result = underTest.std(arr, 3);

            assertEquals("0.8164966", (String.valueOf(result)));

        }
    }

