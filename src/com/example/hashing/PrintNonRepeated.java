package com.example.hashing;

import java.util.HashMap;

public class PrintNonRepeated {

    public static void main(String[] args) {
        int[] array={1,2,3,1,2,3,4,5};
            printNonRepeated(array,array.length);
    }

    static void printNonRepeated(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        // iterating through the elements and
        // incrementing the count in map
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

        // iterating through the elements and if
        // frequency of element is equal to 1
        // then print the element
        for (int i = 0; i < n; i++) {
            if (hm.get(arr[i]) == 1)
                System.out.print(arr[i] + " ");
        }

    }
}
