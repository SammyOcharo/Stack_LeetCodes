package com.samdev.java_stack;

import java.util.Stack;

public class ValidParentheses {

    //Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
    //
    //An input string is valid if:
    //
    //Open brackets must be closed by the same type of brackets.
    //Open brackets must be closed in the correct order.
    //Every close bracket has a corresponding open bracket of the same type.
    //
    //
    //Example 1:
    //
    //Input: s = "()"
    //
    //Output: true
    //
    //Example 2:
    //
    //Input: s = "()[]{}"
    //
    //Output: true
    //
    //Example 3:
    //
    //Input: s = "(]"
    //
    //Output: false
    //
    //Example 4:
    //
    //Input: s = "([])"
    //
    //Output: true

    public static boolean isValidParenthesis(String s){
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(c == '('){
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            }else {
                if(stack.isEmpty() || c != stack.pop()){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
