package com.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGeneration {

    static void generate(long n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while (n-- > 0) {
            String s1 =  q.poll();

            System.out.print(s1 + " ");

            String s2 = s1;
            q.add(s1 + '0');
            q.add(s2 + '1');
        }
    }

}
