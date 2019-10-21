package com.example.sort;

//Given an array arr[] of N integers which is closer sorted (defined below) and an element x
/*Closer Sorted: First array is sorted, but after sorting some
 elements are moved to either of the adjacent positions, i.e, may be to the arr[i+1] or arr[i-1].*/
public class Closer_to_sort {

    public static void main(String[] args) {
        int[] closetSort={3, 2, 10, 4 ,40};
        System.out.println(closer(closetSort,closetSort.length,41));
    }

    // Function to find the element x in arr[]
    // arr[]: input array
    static long closer(int arr[], int n, long x) {
        return binarySearch(arr, 0, n - 1, x);
    }

    // Function to do binary search
    // arr[]: input array
    // l: lower index
    // r: higher index
    // x: element to find
    public static long binarySearch(int arr[], int l, int r, long x) {

        if (r >= l) {

            // finding mid
            int mid = l + (r - l) / 2;

            // check if mid element is equal
            // to x
            if (arr[mid] == x) return mid;

            // if element at mid-1 is equal to x,
            // return mid-1
            if (mid > l && arr[mid - 1] == x) return mid - 1;

            // if element at mid+1 is equal to x,
            // return mid+1
            if (mid < r && arr[mid + 1] == x) return mid + 1;

            // if element at mid is greater than x
            // recurse for left half
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 2, x);
            }

            // else recurse for right half
            return binarySearch(arr, mid + 2, r, x);
        }

        // if element is not present in the array
        return -1;
    }
}
