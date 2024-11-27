package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveOutermostParenthesesTest {

    @Test
    void removeOuterParentheses() {

        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        assertEquals("()()()", removeOutermostParentheses.removeOuterParentheses("(()())(())"));
        assertEquals("()()()()(())", removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"));
        assertEquals("", removeOutermostParentheses.removeOuterParentheses("()()"));
        assertNotEquals("", removeOutermostParentheses.removeOuterParentheses("(()())(())(()(()))"));
    }
}