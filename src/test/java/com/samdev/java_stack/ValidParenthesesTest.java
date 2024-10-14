package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValidParenthesis() {

        String s = "()";
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([])";

        assertTrue(ValidParentheses.isValidParenthesis(s));
        assertTrue(ValidParentheses.isValidParenthesis(s1));
        assertFalse(ValidParentheses.isValidParenthesis(s2));
        assertTrue(ValidParentheses.isValidParenthesis(s3));
    }
}