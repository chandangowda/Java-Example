package com.example.hashing;

import java.util.HashMap;
import java.util.Scanner;

//You are given an array arr of size n. You need to print the distinct elements as they appear in the array.
public class PrintDistinctElement {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

            for (int i = 0; i < n; i++) {
                int key = arr[i];
                if (hm.containsKey(key) == true) {
                    int freq = hm.get(key);
                    freq++;
                    hm.put(key, freq);
                } else
                    hm.put(key, 1);
            }


            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < n; i++) {
                if (hm.get(arr[i]) == 1)
                    sb.append(arr[i] + " ");
            }
            System.out.println(sb);
        }
    }
}
