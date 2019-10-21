package com.example.hashing;

import java.util.HashSet;

/*Given an array arr[] of positive integers. Find the length of the longest sub-sequence such that elements
in the subsequence are consecutive integers,the consecutive numbers can be in any order.*/
public class LongestConsecutiveSubSequence {

    public static void main(String[] args) {
           int[] array={2 ,6 ,1 ,9, 4, 5 ,3};
        System.out.println(findLongestConseqSubseq(array,array.length));
    }

    // Function to find Longest Consecutive Subsequence
    static int findLongestConseqSubseq(int a[], int n) {
        // HashSet to store numbers
        HashSet<Integer> hs = new HashSet<Integer>();
        int ans = 0;

        // Adding elements to hash
        for (int i = 0; i < n; i++)
            hs.add(a[i]);

        for (int i = 0; i < n; i++) {
            if (!hs.contains(a[i] - 1)) {
                int j = a[i];
                while (hs.contains(j)) {
                    j++;
                }
                if (ans < j - a[i])
                    ans = j - a[i];
            }
        }
        return ans;
    }
}
