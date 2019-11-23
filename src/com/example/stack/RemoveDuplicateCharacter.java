package com.example.stack;

import java.util.Stack;


//Removing all consecutive duplicates
//ex:ip-aaaaaabaabccccccc,op-ababc
public class RemoveDuplicateCharacter {


    // Function to print string after removing consecutive duplicates
    public static String removeConsecutiveDuplicates(String str) {

        Stack<Character> st = new Stack<Character>();

        // iterating through the string and
        for (int i = 0; i < str.length(); i++) {

            // if top element at stack is not equal to the character of the string
            if (st.empty() || st.peek() != str.charAt(i)) {
                st.push(str.charAt(i));
            }
        }
        String res = new String("");

        // append all the characters in the stack to answer
        while (!st.empty()) {
            res = st.peek() + res;
            st.pop();
        }
        return (res);
    }
}
