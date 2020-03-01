package com.example.BinaryHeap;

import java.util.PriorityQueue;
import java.util.Queue;

//Given an input stream of n integers, find the kth largest element for each element in the stream.
public class KthLaargestStream {

    public void kthLargest(int arr[], int n, int k) {
        Queue<Integer> pq = new PriorityQueue<>(); // making Minheap
        for (int i = 0; i < k - 1; i++) {
            pq.add(arr[i]);
            System.out.print("-1 ");
        }
        pq.add(arr[k - 1]);
        System.out.print(pq.peek() + " ");
        for (int i = k; i < n; i++) {// the size of heap will remain k now
            if (pq.peek() < arr[i]) { // if top element is smaller than arr[i]
                pq.poll();
                pq.add(arr[i]);
            }
            System.out.print(pq.peek() + " ");
        }
    }
}
