package com.example.sort;

public class MergeSort {

    public static void main(String[] args) {
        int[] mergearray={4,3,2,10,12,1,5,6,1};
        sort(mergearray,0,mergearray.length-1);
        for(int i:mergearray){
            System.out.print(i+",");
        }
    }

    public static void sort(int[] sort, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            sort(sort, low, mid);
            sort(sort, mid + 1, high);

            merge(sort, low, high, mid);
        }
    }

    private static void merge(int[] sort, int low, int high, int mid) {

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = sort[low + i];
        }
        for (int i = 0; i < n2; i++) {
            right[i] = sort[mid + 1 + i];
        }

        int i = 0, j = 0;
        int k = low;

        while (i < n1 && j < n2) {

            if (left[i] <= right[j]) {
                sort[k] = left[i];
                i++;
            } else {
                sort[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            sort[k] = left[i];
            k++;
            i++;
        }

        while (j < n2) {
            sort[k] = right[j];
            k++;
            j++;
        }

    }
}
