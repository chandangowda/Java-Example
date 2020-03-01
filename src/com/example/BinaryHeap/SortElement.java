package com.example.BinaryHeap;

import java.util.PriorityQueue;
import java.util.Queue;

public class SortElement {

    void nearlySorted(int arr[], int num, int k) {
        Queue<Integer> pq = new PriorityQueue<>();
        // Making Minheap for first K element
        for (int i = 0; i < k; ++i)
            pq.add(arr[i]);

        for (int i = k; i < num; i++) {
            // popping topmost and inserting one more
            System.out.print(pq.peek() + " ");
            pq.poll();
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()) {
            // popping till heap becomes empty
            System.out.print(pq.peek() + " ");
            pq.poll();
        }

    }
}
