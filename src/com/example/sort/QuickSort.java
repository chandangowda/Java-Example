package com.example.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] quicksortarray={4,3,2,10,12,1,5,6,1};
        quicksort(quicksortarray,0,quicksortarray.length-1);
        Arrays.stream(quicksortarray).forEach(e -> System.out.print(e + ","));
    }

    public static void quicksort(int[] sort, int low, int high) {
        if (low < high) {
            int position = partition(sort, low, high);
            quicksort(sort,low,position-1);
            quicksort(sort,position+1,high);
        }
    }

    private static int partition(int[] sort, int low, int high) {
        int pivot = sort[high];
        int i = low-1;
        for (int j = low; j < high; j++) {
            if (sort[j] < pivot) {
                i++;
                int temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;

            }
        }
        int temp = sort[i + 1];
        sort[i + 1] = pivot;
        sort[high] = temp;
        return i+1;
    }
}





