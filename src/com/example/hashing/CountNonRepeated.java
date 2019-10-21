package com.example.hashing;

import java.util.HashMap;

public class CountNonRepeated {

    public static void main(String[] args) {
        int[] array={1 ,1 ,2, 2 ,3 ,3, 4, 5, 6, 7};
        System.out.println(countNonRepeated(array,array.length));
    }

    static long countNonRepeated(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // iterating through the array
        // and storing the frequency of each elements
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (hm.containsKey(key) == true) {
                int freq = hm.get(key);
                freq++;
                hm.put(key, freq);
            } else {
                hm.put(key, 1);
            }
        }
        long count = 0;

        // Now, iterate through the array elements
        // and check if frequency is 1, incremenet the counter
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1)
                count++;
        }
        return count;
    }
}
