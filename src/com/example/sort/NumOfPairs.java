package com.example.sort;

import java.util.Arrays;


//Given two arrays X and Y of positive integers, find number of pairs such that xy > yx (raised to power of)
//where x is an element from X and y is an element from Y.
public class NumOfPairs {

    public static void main(String[] args) {
        int[] firstPair={2, 1 ,6};
        int[] secondPair={1,5};

        System.out.println(countPairs(firstPair,secondPair,firstPair.length,secondPair.length));
    }

    static long countPairs(int x[], int y[], int n, int m) {
        int[] freq = new int[5];

        // store the frequency of elements less than 5
        for (int i = 0; i < m; i++) {
            if (y[i] < 5)
                freq[y[i]]++;
        }

        // sort the array
        Arrays.sort(y);
        long ans = 0;

        // iterating over each element of the array
        for (int i = 0; i < n; i++) {
            // If x is 0, then there cannot be any value in Y such that
            // x^Y[i] > Y[i]^x
            if (x[i] == 0)
                continue;

            // If x is 1, then the number of pais is equal to number of
            // zeroes in Y[]
            if (x[i] == 1) {
                ans = ans + (long) freq[0];
                continue;
            }

            // Find number of elements in Y[] with values greater than x
            // upper_bound() gets address of first greater element in Y[0..n-1]
            int ind = binary(n, m, x[i], y);

            // If we have reached here, then x must be greater than 1,
            // increase number of pairs for y=0 and y=1
            ans = ans + (long) (m - ind) + (long) freq[0] + (long) freq[1];

            // Decrease number of pairs for x=2 and (y=4 or y=3)
            if (x[i] == 2)
                ans = ans - (long) freq[3] - (long) freq[4];

            // Increase number of pairs for x=3 and y=2
            if (x[i] == 3)
                ans = ans + (long) freq[2];
        }
        return ans;
    }

    // Function to find upper bound using binary search
    public static int binary(int n, int m, int x, int[] y) {
        int high = m - 1, low = 0;
        int ans = high + 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (y[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }
}
