package com.example.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountEqualZeroAndOne {

    // function to count subarrays with
// equal number of 1's and 0's
    static int countSubarrWithEqualZeroAndOne(int arr[], int n) {
        // 'um' implemented as hash table to store
        // frequency of values obtained through
        // cumulative sum
        Map<Integer, Integer> um = new HashMap<>();
        int curr_sum = 0;

        // Traverse original array and compute cumulative
        // sum and increase count by 1 for this sum
        // in 'um'. Adds '-1' when arr[i] == 0
        for (int i = 0; i < n; i++) {
            curr_sum += (arr[i] == 0) ? -1 : arr[i];
            um.put(curr_sum, um.get(curr_sum) == null ? 1 : um.get(curr_sum) + 1);
        }

        int count = 0;

        // traverse the hash table 'um'
        for (Map.Entry<Integer, Integer> itr : um.entrySet()) {

            // If there are more than one prefix subarrays
            // with a particular sum
            if (itr.getValue() > 1)
                count += ((itr.getValue() * (itr.getValue() - 1)) / 2);
        }

        // add the subarrays starting from 1st element and
        // have equal number of 1's and 0's
        if (um.containsKey(0))
            count += um.get(0);

        // required count of subarrays
        return count;
    }

    // Function that returns count of sub arrays
    // with equal numbers of 1's and 0's
    static int countSubarrWithEqualZeroAndOne1(int[] arr, int n) {
        Map<Integer, Integer> myMap = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            //Replacing 0's in array with -1
            if (arr[i] == 0)
                arr[i] = -1;

            sum += arr[i];

            //If sum = 0, it implies number of 0's and 1's are
            //equal from arr[0]..arr[i]
            if (sum == 0)
                count++;

            if (myMap.containsKey(sum))
                count += myMap.get(sum);

            if (!myMap.containsKey(sum))
                myMap.put(sum, 1);
            else
                myMap.put(sum, myMap.get(sum) + 1);
        }
        return count;
    }

    // Driver program to test above
    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1, 1};
        int n = arr.length;
        System.out.println("Count = "
                + countSubarrWithEqualZeroAndOne(arr, n));
    }
}
