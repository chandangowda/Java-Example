package com.example.BinaryHeap;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElement {

    public static int KthLargest(int arr[], int n, int k) {
        Queue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            if (pq.size() == k && pq.peek() < arr[i]) { // if size becomes equal to k
                // and top element is smaller than arr[i]
                pq.poll();
                pq.add(arr[i]);
            } else if (pq.size() < k)
                pq.add(arr[i]);
        }
        return pq.peek(); // return Kthlargest element
    }
}
