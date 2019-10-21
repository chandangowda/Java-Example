package com.example.hashing;

import java.util.HashMap;
import java.util.Scanner;

//You are given an array A of size N. You need to print the total count of sub-arrays having their sum equal to 0
public class ZeroSumSubArray {



    public static void main(String[] args) {
      int [] array={1,2,-3,4,5,-9,12,3,-15};
            s(array);

    }

    public static void s(int[] a) {
        int c = 0;
        int s = 0;
        HashMap<Integer, Integer> ss = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            s = s + a[i];
            if (s == 0)//if prefix sum is zero that means we encounter a zero sum subarray
                c++; //hence we increment the counter
            if (ss.containsKey(s)) {//If map contains the sum. This means we have previously seen the sum
                c = c + ss.get(s);
                ss.put(s, ss.get(s) + 1);  //increment value of key
            } else {
                ss.put(s, 1); //put value as 1 for key s
            }
        }
        System.out.println(c);//print the answer
    }
}
