package com.example.queue;

import java.util.Stack;

public class QueueUsingTwoStack {

    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();

    void insert(int B) {
        s1.push(B);
    }

    int remove() {
        if (s2.isEmpty()) {
            if (s1.isEmpty())
                return -1;


            while (!s1.isEmpty()) {
                int r = s1.peek();
                s1.pop();
                s2.push(r);
            }
            int k = s2.peek();
            s2.pop();

            while (!s2.isEmpty()) {
                int l = s2.peek();
                s2.pop();
                s1.push(l);
            }
            return k;
        }
        return -1;
    }
}
