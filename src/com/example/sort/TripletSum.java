package com.example.sort;

import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {
        int[] trpletArray={1, 4 ,45, 6 ,10 ,8};
        System.out.println(find3Numbers(trpletArray,trpletArray.length,13));
    }

    public static int find3Numbers(int A[], int n, int x) {
        int l, r;
        Arrays.sort(A);

        /* Now fix the first element one by one and find the other two elements */
        for (int i = 0; i < n - 2; i++) {

            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = n - 1; // index of the last element
            while (l < r) {
                if (A[i] + A[l] + A[r] == x) {

                    return 1;
                } else if (A[i] + A[l] + A[r] < x)
                    l++;

                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }

        // If we reach here, then no triplet was found
        return 0;
    }
}
