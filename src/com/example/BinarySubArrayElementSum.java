package com.example;


//Given an unsorted array A of size N of non-negative integers,
//find a continuous sub-array which adds to a given number S.
public class BinarySubArrayElementSum {

    public static void main(String[] args) {
        int[] subArraySum={1 ,2 ,3 ,4 ,5 ,6 ,7, 8, 9, 10};
        subarraySum(subArraySum.length,15,subArraySum);
    }

    static void subarraySum(int n, int s, int[] m) {
        int first = 0;
        int last = 0;

        long result = m[first];

        while (result != s) {
            if (result > s) {
                if (first == last) {
                    last++;
                    first++;
                    if (last >= n) break;
                    result = m[first];
                } else {
                    result -= m[first];
                    first++;
                }
            } else {
                last++;
                if (last < n) {
                    result += m[last];
                } else {
                    break;
                }
            }
        }

        if (result != s) {
            System.out.print(-1);
        } else {
            System.out.print((first + 1) + " " + (last + 1));
        }
    }
}
