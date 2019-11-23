package com.example.stack;

import java.util.Stack;

public class EvalutePostFix {

    public static int evaluatePostFix(String exp) {
        Stack<Integer> st = new Stack<Integer>();
        int n = exp.length();
        // System.out.println(exp);
        for (int i = 0; i < n; i++) {
            // System.out.println(st);
            if (Character.isDigit(exp.charAt(i))) {
                st.push(exp.charAt(i) - '0');
            } else {
                int val1 = st.pop();
                int val2 = st.pop();
                switch (exp.charAt(i)) {
                    case '+':
                        st.push(val2 + val1);
                        break;
                    case '-':
                        st.push(val2 - val1);
                        break;
                    case '*':
                        st.push(val2 * val1);
                        break;
                    case '/':
                        st.push(val2 / val1);
                        break;
                }
            }
        }
        return st.pop();
    }
}
