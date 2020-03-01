package com.example.BinaryHeap;

import java.util.PriorityQueue;

public class MinCost {

    void minCost(long arr[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) pq.add(arr[i]);

        Long cost = new Long("0");
        while (pq.size() != 1) {
            long x = pq.poll(); // storing first
            long y = pq.poll(); // storing second
            cost += (x + y);
            pq.add(x + y); // push first and second back in priority queue
        }
        System.out.println(cost);
    }
}
