package com.example.sort;

import java.util.Arrays;

public class CountPossibleTriangle {

    public static void main(String[] args) {
        int[] possibleTriangleArray={6 ,4 ,9, 7, 8};
        System.out.println(findNumberOfTriangles(possibleTriangleArray,possibleTriangleArray.length));

    }

    static long findNumberOfTriangles(int arr[], int n)
    {
        // sorting the array
        Arrays.sort(arr);
        long count = 0L;

        // traversing the elements of the array
        for(long i = 0; i < n-2; i++)
        {
            long k = i+2;

            // taking element just after ith element
            for (long j = i+1; j < n; ++j)
            {
                // Traversing all the elements
                // to check if there is any element exists
                // which can satisfy the condition of triangle
                // with the elements at ith and jth index
                //a+b>c
                while (k < n && arr[(int)i] + arr[(int)j] > arr[(int)k])
                    ++k;
                count += k - j - 1;
            }
        }
        return count;
    }
}
