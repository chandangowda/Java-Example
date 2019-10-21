package com.example.sort;

import java.util.Arrays;

/*Given an array A[] of N elements. The task is to complete the function which returns true if
triplets exists in array A whose sum is zero else returns false.*/
public class Triplet {

    public static void main(String[] args) {
        int[] tripletarray={0 ,-1 ,2 ,-3, 1};

       // int[] tripletarray={1,2,3};
        System.out.println(findTriplets(tripletarray,tripletarray.length));

    }
    // Function to find if triplet is present in the array
    public static boolean findTriplets(int arr[], int n) {
        // sort the elements
        Arrays.sort(arr);

        // traversing the array elements
        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;
            int x = arr[i];

            // find the two elements which sum upto zero
            // with element at ith index
            while (l < r) {

                // check if the sum is equal to 0
                if (x + arr[l] + arr[r] == 0)
                    return true;
                    // else, if the sum is less than zero
                    // then you need to take greater element
                else if (x + arr[l] + arr[r] < 0)
                    l++;
                    // If the sum is greater than 0
                    // then you need to include some smaller elelment
                    // instead of something greater
                else
                    r--;
            }
        }
        return false;
    }
}
