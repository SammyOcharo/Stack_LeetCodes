package com.samdev.java_stack;

import java.util.Stack;

public class RemoveAdjacentDuplicatesString {
    public String removeDuplicates(String s) {
        StringBuilder newWord = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            }else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()){
            newWord.append(stack.pop());
        }

        return newWord.reverse().toString();
    }
}
