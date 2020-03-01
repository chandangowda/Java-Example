package com.example.BinaryHeap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class KLargestElement {

    public static void kthLargest(int arr[], int n, int k) {
        Queue<Integer> q = new PriorityQueue<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (q.size() == k)  // if size becomes equal to k
            {
                if (q.peek() < arr[i])  // if top element is smaller than arr[i]
                {
                    q.poll();
                    q.add(arr[i]);
                }
            } else {
                q.add(arr[i]);

            }
        }

        while (q.isEmpty() == false) {
            list.add(q.peek()); // push all heap elements in vector
            q.poll();
        }
        for (int i = list.size() - 1; i >= 0; i--)
            System.out.print(list.get(i) + " ");
        System.out.println();
    }
}
