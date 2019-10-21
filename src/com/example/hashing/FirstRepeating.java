package com.example.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//Given an array arr[] of size N. The task is to find the first repeating element in an array of integers,
//i.e., an element that occurs more than once and whose index of first occurrence is smallest.

public class FirstRepeating {

    static int a[] = new int[10000000];
    static HashMap<Integer, Integer> um = new HashMap<>();

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());

            int ans = -1;
            String st[] = read.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                a[i] = Integer.parseInt(st[i]);

            // iterating through the array elements
            // and increment the count in map
            for (int i = 0; i < n; i++) {
                int key = a[i];
                if (um.containsKey(key) == true) {
                    int freq = um.get(key);
                    freq++;
                    um.put(key, freq);
                } else um.put(key, 1);
            }

            // Iterating through the array elements
            // and check if frequency is greater than 1,
            // then store that index in ans
            for (int i = 0; i < n; i++) {
                if (um.get(a[i]) > 1) {
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans);
            um.clear();
        }
    }
}
