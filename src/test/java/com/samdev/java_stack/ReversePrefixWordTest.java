package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefixWordTest {

    @Test
    void reversePrefix() {

        ReversePrefixWord reversePrefixWord = new ReversePrefixWord();

        assertEquals("dcbaefd", reversePrefixWord.reversePrefix("abcdefd", 'd'), "Return True");
        assertEquals("zxyxxe", reversePrefixWord.reversePrefix("xyxzxe", 'z'), "Return True");
        assertEquals("abcd", reversePrefixWord.reversePrefix("abcd", 'z'), "Return True");
        assertNotEquals("aaaaa", reversePrefixWord.reversePrefix("abcdefd", 'd'), "Return False");
    }
}