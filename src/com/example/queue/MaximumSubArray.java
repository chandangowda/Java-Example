package com.example.queue;

import java.util.Deque;
import java.util.LinkedList;

//Given an array A and an integer K. Find the maximum for each and every contiguous subarray of size K.
public class MaximumSubArray {
    static void max_of_subarrays(int arr[], int n, int k) {
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (i = 0; i < k; i++) {
            while (dq.isEmpty() == false && arr[i] >= arr[dq.peekLast()])
                dq.pollLast();

            dq.add(i);
        }

        for (; i < n; i++) {

            sb.append(arr[dq.peek()] + " ");

            while (dq.isEmpty() == false && (dq.peekFirst() <= i - k))
                dq.pollFirst();

            while (dq.isEmpty() == false && (arr[i] >= arr[dq.peekLast()]))
                dq.pollLast();

            dq.add(i);
        }

        sb.append(arr[dq.peek()]);
        dq.pollFirst();
        System.out.print(sb);

    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        max_of_subarrays(arr, 9, 3);
    }
}
