package com.example.tree.binary;

import com.example.tree.Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.TreeSet;

/*Given an array arr[] of N elements. The task is to count maximum number of distinct smaller
elements on right side of any array element. For example, in {10, 6, 9, 7, 20, 19, 21, 18, 17, 16},
the result is 4.  Note that 20 has maximum 4 smaller elements on right side. Other elements have less count,
for example 10 has 3 smaller elements on right side.*/
public class MaxOnRight extends Tree {

    static int getMaxSmallerOnRight(int[] arr, int n) {
        int cnt = 0;

        TreeSet<Integer> tst = new TreeSet<Integer>();

        // iterating over each array elements
        for (int i = n - 1; i >= 0; i--) {
            tst.add(arr[i]);

            // find the first element that is lower than arr[i]
            // Find the distance between above found element
            // and the beginning of the set using distance function
            cnt = Integer.max(tst.headSet(arr[i]).size(), cnt);
        }
        return cnt;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(getMaxSmallerOnRight(arr, n));
        }
    }
}
