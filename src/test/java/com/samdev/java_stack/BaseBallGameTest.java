package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseBallGameTest {

    @Test
    void calPoints() {
        BaseBallGame game = new BaseBallGame();

        // Test case 1: Standard example
        String[] operations1 = {"5", "2", "C", "D", "+"};
        assertEquals(30, game.calPoints(operations1), "Test Case 1 Failed");

        // Test case 2: All operations are integers
        String[] operations2 = {"1", "2", "3", "4", "5"};
        assertEquals(15, game.calPoints(operations2), "Test Case 2 Failed");

        // Test case 3: Including invalidation (C) multiple times
        String[] operations3 = {"10", "C", "20", "+", "D"};
        assertEquals(60, game.calPoints(operations3), "Test Case 3 Failed");

        // Test case 4: Empty operations
        String[] operations4 = {};
        assertEquals(0, game.calPoints(operations4), "Test Case 4 Failed");

        // Test case 5: Edge case with only one valid operation
        String[] operations5 = {"50"};
        assertEquals(50, game.calPoints(operations5), "Test Case 5 Failed");

        // Test case 6: Multiple "+" operations
        String[] operations6 = {"5", "10", "+", "+", "+"};
        assertNotEquals(45, game.calPoints(operations6), "Test Case 6 Failed");
    }
}