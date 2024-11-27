package com.samdev.java_stack;

import java.util.Stack;

public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Character> letter = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '('){
                if(!letter.isEmpty()){
                    result.append(c);
                }
                letter.push(c);
            }else {
                letter.pop();
                if(!letter.isEmpty()){
                    result.append(c);
                }
            }
        }

        return result.toString();
    }
}
