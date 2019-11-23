package com.example.stack;

import java.util.Stack;

//Remove Duplicate pair in String
//ip:aaaa,op:empty String
public class RemoveDuplicatePair {
    // Function to print string after removing consecutive duplicates
    public static String removePair(String str) {
        Stack<Character> st = new Stack<Character>();

        // push first character into the stack
        st.push(str.charAt(0));

        // iterating over the remaining character
        for (int i = 1; i < str.length(); i++) {

            // if stack is not empty and current character in string
            // is equal to the character at the top
            if (!st.empty() && str.charAt(i) == st.peek()) {
                st.pop();
                continue;
            }

            // else push the character to the stack
            else {
                st.push(str.charAt(i));
            }
        }

        String res = new String("");


        if (!st.empty()) {
            // compiling the answer string
            while (!st.empty()) {
                res = st.peek() + res;
                st.pop();
            }

        }
        return res;
    }
}
