package com.samdev.java_stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UseStacksToPalindromeInLinkedListTest {

    // Helper method to create a linked list from an array of values
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next; // Return the head of the list
    }

    @Test
    public void testPalindromeList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = createLinkedList(new int[]{1, 2, 2, 1});
        assertTrue(solution.isPalindrome(head), "Expected true for a palindrome list");
    }

    @Test
    public void testNonPalindromeList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = createLinkedList(new int[]{1, 2});
        assertFalse(solution.isPalindrome(head), "Expected false for a non-palindrome list");
    }

    @Test
    public void testSingleElementList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = createLinkedList(new int[]{1});
        assertTrue(solution.isPalindrome(head), "Expected true for a single element list");
    }

    @Test
    public void testEmptyList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = null; // Empty list
        assertTrue(solution.isPalindrome(head), "Expected true for an empty list");
    }

    @Test
    public void testLongPalindromeList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 3, 2, 1});
        assertTrue(solution.isPalindrome(head), "Expected true for a long palindrome list");
    }

    @Test
    public void testLongNonPalindromeList() {
        UseStacksToPalindromeInLinkedList solution = new UseStacksToPalindromeInLinkedList();

        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5, 6});
        assertFalse(solution.isPalindrome(head), "Expected false for a long non-palindrome list");
    }
}