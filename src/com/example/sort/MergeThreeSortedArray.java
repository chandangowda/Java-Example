package com.example.sort;

import java.util.ArrayList;

public class MergeThreeSortedArray {

    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4};
        int[] arr2={1 ,2, 3 ,4 ,5};
        int[] arr3={4,5,6,7,8};
        System.out.println(merge3sorted(arr1,arr2,arr3));
    }

    static ArrayList<Integer> merge3sorted(int A[], int B[], int C[]) {
        // Finding length of all the input arrays
        int m = A.length;
        int n = B.length;
        int o = C.length;

        int i = 0, j = 0, k = 0;

        // list to store output
        ArrayList<Integer> list = new ArrayList<>();

        // Iterating over the input array
        while (i < m && j < n && k < o) {
            // minimum lement of the arrays
            int min = Math.min(Math.min(A[i], B[j]), C[k]);

            // add this min element from all the three arrays
            list.add(min);

            if (min == A[i])
                i++;
            else if (min == B[j])
                j++;
            else if (min == C[k])
                k++;
        }

        // C exhausted
        while (i < m && j < n) {
            if (A[i] <= B[j]) {
                list.add(A[i]);
                i++;
            } else {
                list.add(B[j]);
                j++;
            }
        }

        // B exhausted
        while (i < m && k < o) {
            if (A[i] <= C[k]) {
                list.add(A[i]);
                i++;
            } else {
                list.add(C[k]);
                k++;
            }
        }

        // A exhausted
        while (j < n && k < o) {
            if (B[j] <= C[k]) {
                list.add(B[j]);
                j++;
            } else {
                list.add(C[k]);
                k++;
            }
        }

        // B and C has exhausted
        while (i < m) {
            list.add(A[i]);
            i++;
        }

        // A and C has exhausted
        while (j < n) {
            list.add(B[j]);
            j++;
        }

        // A and B has exhausted
        while (k < o) {
            list.add(C[k]);
            k++;
        }
        return list;

    }
}
