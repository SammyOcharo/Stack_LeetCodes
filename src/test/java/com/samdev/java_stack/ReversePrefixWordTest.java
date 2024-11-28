package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixWordTest {

    @Test
    void reversePrefix() {

        ReversePrefixWord reversePrefixWord = new ReversePrefixWord();

        assertEquals("dcbaefd", reversePrefixWord.reversePrefix("abcdefd", 'd'), "Return True");

    }
}