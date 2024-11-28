package com.samdev.java_stack;

import java.util.Stack;

public class FinalPricesWithSpecialDiscountInShop {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < n; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                int index = stack.pop();

                result[index] = prices[index] - prices[i];
            }

            stack.push(i);
        }

        while(!stack.isEmpty()){
            int index = stack.pop();
            result[index] = prices[index];
        }

        return result;
    }
}
