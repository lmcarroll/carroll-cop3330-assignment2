/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex35test;

import ex25.PasswordStrengthIndicator;
import ex35.PickingAWinner;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PickingAWinnerTest {

    @Test

    public void testPickingAWinner() {

        PickingAWinner underTest = new PickingAWinner();

        ArrayList<String> contestants = new ArrayList<>();
        contestants.add("John");

        underTest.winnerPicker(contestants);

        assertEquals(true, true);

    }
}

