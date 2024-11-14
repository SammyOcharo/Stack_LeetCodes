package com.samdev.java_stack;


//234. Palindrome Linked List

//Given the head of a singly linked list, return true if it is a
//palindrome
// or false otherwise.
//
//
//
//Example 1:
//
//
//Input: head = [1,2,2,1]
//Output: true
//Example 2:
//
//
//Input: head = [1,2]
//Output: false
//
//
//Constraints:
//
//The number of nodes in the list is in the range [1, 105].
//0 <= Node.val <= 9
//
//
//Follow up: Could you do it in O(n) time and O(1) space?

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}
public class UseStacksToPalindromeInLinkedList {
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }

        Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        while(current != null){
            stack.push(current.val);
            current = current.next;
        }

        current = head;
        while(current != null){
            if(current.val != stack.pop()){
                return false;
            }
            current = current.next;
        }

        return true;
    }
}
