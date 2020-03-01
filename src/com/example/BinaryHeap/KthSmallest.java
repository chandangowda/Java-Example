package com.example.BinaryHeap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthSmallest {

    public static int kthSmallest(int arr[], int n, int k) {

        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            if (pq.size() == k && pq.peek() > arr[i]) // if size becomes equal to k
            // and top element is larger than arr[i]
            {
                pq.poll();
                pq.add(arr[i]);
            } else if (pq.size() < k)
                pq.add(arr[i]);
        }

        return pq.peek(); // // returns kth smallest element
    }
}
