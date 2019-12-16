package com.example.queue;

import java.util.Queue;
import java.util.Stack;

public class ReverseQueueUsingStack {


    public Queue<Integer> rev(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();         // Use a stack to reverse the queue.
        while (!q.isEmpty()) {
            int x = q.peek();
            q.poll();
            s.push(x);
        }
        while (!s.isEmpty()) {
            int x = s.peek();
            s.pop();
            q.add(x);
        }
        return q;
    }
}
