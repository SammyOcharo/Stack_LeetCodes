package com.samdev.java_stack;

import java.util.Stack;

public class BackspaceString {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> Soutput = new Stack<>();
        Stack<Character> Toutput = new Stack<>();

        for(char c: s.toCharArray()){
            if(c != '#'){
                Soutput.push(c);
            }else {
                Soutput.pop();
            }
        }
        for(char d: t.toCharArray()){
            if(d != '#'){
                Toutput.push(d);
            }else {
                Toutput.pop();
            }
        }

        System.out.println(Soutput);
        System.out.println(Toutput);

        return Soutput.equals(Toutput);


    }

}
