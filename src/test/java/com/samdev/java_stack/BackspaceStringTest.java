package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStringTest {

    @Test
    void backspaceCompare() {

        BackspaceString backspaceString = new BackspaceString();

        assertTrue(backspaceString.backspaceCompare("ab#c", "ad#c"));

        assertTrue(backspaceString.backspaceCompare("ab##", "c#d#"));

        assertFalse(backspaceString.backspaceCompare("a#c", "b"));
    }
}