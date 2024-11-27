package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAdjacentDuplicatesStringTest {

    @Test
    void removeDuplicates() {
        RemoveAdjacentDuplicatesString removeAdjacentDuplicatesString = new RemoveAdjacentDuplicatesString();
        assertEquals("ca", removeAdjacentDuplicatesString.removeDuplicates("abbaca"), "Expected is to be True");
        assertEquals("ay", removeAdjacentDuplicatesString.removeDuplicates("azxxzy"), "Expected is to be True");

    }
}