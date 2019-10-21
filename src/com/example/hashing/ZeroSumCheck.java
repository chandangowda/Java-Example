package com.example.hashing;

import java.util.HashMap;

public class ZeroSumCheck {

    public static void main(String[] args) {
        int[] array={4 ,2 ,-3 ,1 ,6};
        System.out.println(findsum(array,array.length));
    }

    static boolean findsum(int arr[], int n) {
        // Creates an empty hashMap hM
        HashMap<Integer, Integer> hM =
                new HashMap<Integer, Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++) {
            // Add current element to sum
            sum += arr[i];

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0 || sum == 0 || hM.get(sum) != null)
                return true;

            // Add sum to hash map
            hM.put(sum, i);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }
}
