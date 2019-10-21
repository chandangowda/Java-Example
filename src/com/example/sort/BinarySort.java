package com.example.sort;

public class BinarySort {

    public static void main(String[] args) {
        int[] binarysort={1 ,0 ,1 ,1 ,1 ,1 ,1 ,0 ,0 ,0};
        binSort(binarysort,binarysort.length);
        for (int i:binarysort){
            System.out.print(i+",");
        }
    }

    static void binSort(int A[], int n) {
        int low = 0, high = n - 1;

        // using segregation method
        while (low <= high) {

            // if element at left index is 0, then nothing to do
            if (A[low] == 0) {
                low++;
            }

            // if element at high index is 1, nothing to do
            // leave it
            else if (A[high] == 1) {
                high--;
            }

            // else, swap the elements at left and right index
            else {
                int temp = A[low];
                A[low] = A[high];
                A[high] = temp;
                low++;
                high--;
            }
        }
    }
}
