package com.example.hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
/*
Given two arrays A1[] and A2[] of size N and M respectively.
The task is to sort A1 in such a way that the relative order among the elements will be same as those in A2.
For the elements not present in A2, append them at last in sorted order. It is also given that the number of
elements in A2[] are smaller than or equal to number of elements in A1[] and A2[] has all distinct elements.*/


public class RelativeSorting {

    public static void main(String[] args) {


        HashMap<Integer, Integer> mp = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            int A[] = new int[m];
            int B[] = new int[n];


            for (int i = 0; i < m; i++)
                A[i] = sc.nextInt();

            for (int i = 0; i < m; i++) {
                int key = A[i];

                if (mp.containsKey(key) == true) {
                    int freq = mp.get(key);
                    freq++;
                    mp.put(key, freq);
                } else mp.put(key, 1);
            }

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < n; i++)
                B[i] = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (mp.containsKey(B[i]) == true) {
                    int freq = mp.get(B[i]);
                    while (freq != 0) {
                        sb.append(B[i] + " ");
                        freq--;
                    }
                    if (freq == 0)
                        mp.remove(B[i]);

                }
            }

            ArrayList<Integer> list = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                if (mp.containsKey(A[i]) == true)
                    list.add(A[i]);
            }
            Collections.sort(list);

            for (Integer val : list)
                sb.append(val + " ");

            System.out.println(sb);
            mp.clear();
        }

    }
}
