package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOutermostParenthesesTest {

    @Test
    void removeOuterParentheses() {

        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        assertEquals("()()()", removeOutermostParentheses.removeOuterParentheses("(()())(())"), "expected a True");
        assertEquals("()()()()(())", removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"), "expected a True");
        assertEquals("", removeOutermostParentheses.removeOuterParentheses("()()"), "expected a True");
        assertNotEquals("", removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"), "Expected a False");
    }
}