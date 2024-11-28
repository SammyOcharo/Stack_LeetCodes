package com.samdev.java_stack;

import java.util.Stack;

public class ReversePrefixWord {
    public String reversePrefix(String word, char ch) {
        Stack<Character> stack = new Stack<>();
        StringBuilder newWord = new StringBuilder();

        boolean found = false;

        for(char c: word.toCharArray()){
            stack.push(c);
            if(c == ch){
                found = true;
                break;
            }
        }
        if(found){
            while(!stack.isEmpty()){
                newWord.append(stack.pop());
            }

            newWord.append(word.substring(newWord.length()));

            return newWord.toString();
        }else{
            return word;
        }
    }
}
