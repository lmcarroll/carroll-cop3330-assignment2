/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Liam Carroll
 */

package ex32test;

import ex32.GuessTheNumberGame;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuessTheNumberGameTest {
    @Test

    public void testGuessTheNumberGame() {

        GuessTheNumberGame underTest = new GuessTheNumberGame();

        int result = underTest.generateTheNumber(3);

        assertEquals(500, result, 500);

    }
}
