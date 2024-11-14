package com.samdev.java_stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class ImplementQueuesUsingStackTest {

    private ImplementQueuesUsingStack myQueue;

    @BeforeEach
    void setUp() {
        myQueue = new ImplementQueuesUsingStack();
    }

    @Test
    void pushTest() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        // Peek should return the front of the queue (FIFO order)
        assertEquals(1, myQueue.peek());
    }

    @Test
    void popTest() {
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        // Pop should return the front element and maintain FIFO order
        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.pop());
    }

    @Test
    void peekTest() {
        myQueue.push(1);
        myQueue.push(2);

        // Peek should return the front element without removing it
        assertEquals(1, myQueue.peek());
    }

    @Test
    void emptyTest() {
        // Initially the queue should be empty
        assertTrue(myQueue.empty());

        myQueue.push(1);

        // After pushing, it should not be empty
        assertFalse(myQueue.empty());

        myQueue.pop();

        // After popping, the queue should be empty again
        assertTrue(myQueue.empty());
    }

    @Test
    void popThrowsExceptionWhenEmpty() {
        // Trying to pop when the queue is empty should throw an exception
        assertThrows(EmptyStackException.class, myQueue::pop);
    }

    @Test
    void peekThrowsExceptionWhenEmpty() {
        // Trying to peek when the queue is empty should throw an exception
        assertThrows(EmptyStackException.class, myQueue::peek);
    }
}
