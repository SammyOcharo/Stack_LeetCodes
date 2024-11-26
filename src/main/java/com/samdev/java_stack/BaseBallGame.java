package com.samdev.java_stack;

import java.util.Stack;

public class BaseBallGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String operation:operations){
            switch(operation){
                case "C":
                    if(!stack.isEmpty()){
                        stack.pop();
                    }

                    break;

                case "D":
                    if(!stack.isEmpty()){
                        stack.push(stack.peek() * 2);
                    }

                    break;

                case "+":
                    if(!stack.isEmpty() && stack.size()>=2){
                        int lastNumber = stack.pop();

                        int secondLastNumber = stack.peek();

                        stack.push(lastNumber);
                        stack.push(lastNumber + secondLastNumber);
                    }

                    break;
                default :
                    stack.push(Integer.parseInt(operation));

            }
        }
        int totals = 0;
        for(int digit: stack){
            totals += digit;
        }

        return totals;
    }

}
