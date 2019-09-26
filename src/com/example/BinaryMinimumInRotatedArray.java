package com.example;

//Given an array A  which is sorted and contains N distinct elements.
// Also, this array is rotated at some unknown point. The task is to find the minimum element in it
public class BinaryMinimumInRotatedArray {

    public static void main(String[] args) {
        int[] rotatedArray={2 ,3, 4, 5, 6, 7, 8, 9, 10, 1};
        System.out.println(minNumber(rotatedArray,0,rotatedArray.length-1));

    }

    // Function to find minimum number in the array
    static long minNumber(int arr[], long low, long high)
    {
        // base case
        if (high < low)
            return arr[0];

        if (high == low)
            return arr[(int)low];
        long mid = low + (high - low)/2;

        // check if mid+1 element is the minimum number
        if (mid < high && arr[(int)mid+1] < arr[(int)mid])
            return arr[(int)mid+1];

        // check if mid element is the minimum element
        if (mid > low && arr[(int)mid] < arr[(int)mid - 1])
            return arr[(int)mid];

        // recurse for left half
        if (arr[(int)high] > arr[(int)mid])
            return minNumber(arr, low, mid-1);

        // recurse for right half
        return minNumber(arr, mid+1, high);
    }
}
