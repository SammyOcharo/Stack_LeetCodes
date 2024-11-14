package com.samdev.java_stack;

import java.util.Stack;

//232. Implement Queue using Stacks
//Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the functions of a normal queue (push, peek, pop, and empty).
//
//Implement the MyQueue class:
//
//void push(int x) Pushes element x to the back of the queue.
//int pop() Removes the element from the front of the queue and returns it.
//int peek() Returns the element at the front of the queue.
//boolean empty() Returns true if the queue is empty, false otherwise.
//Notes:
//
//You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
//Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.
//
//
//Example 1:
//
//Input
//["MyQueue", "push", "push", "peek", "pop", "empty"]
//[[], [1], [2], [], [], []]
//Output
//[null, null, null, 1, 1, false]
//
//Explanation
//MyQueue myQueue = new MyQueue();
//myQueue.push(1); // queue is: [1]
//myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
//myQueue.peek(); // return 1
//myQueue.pop(); // return 1, queue is [2]
//myQueue.empty(); // return false

public class ImplementQueuesUsingStack {


        private Stack<Integer> inputStack;
        private Stack<Integer> outputStack;

        public ImplementQueuesUsingStack() {
            inputStack = new Stack<>();
            outputStack = new Stack<>();
        }

        //pushes the integer to the stack. at the end of the line. just same as in Queue
        public void push(int x) {
            inputStack.push(x);
        }

        //in stack its LIFO but in Queue its FIFO. So we find a way to reverse our stack entries.
        public int pop() {
            if(outputStack.isEmpty()){
                reverseStack();
            }
            return outputStack.pop();
        }
        //helper method to reverse our stack
        public void reverseStack(){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }

        public int peek() {
            if(outputStack.isEmpty()){
                reverseStack();
            }
            return outputStack.peek();

        }

        public boolean empty() {

            return inputStack.isEmpty() && outputStack.isEmpty();

        }

}
