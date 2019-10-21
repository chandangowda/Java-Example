package com.example.sort;


//Merge Without Extra Space
public class MergeSortWithoutExtraSpcae {

    static int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
    static int arr2[] = new int[]{2, 3, 8, 13};

    public static void main(String[] args) {
        merge(arr1, arr2, arr1.length, arr2.length);
        for (int i : arr1) {
            System.out.print(i + ",");
        }
        for (int i : arr2) {
            System.out.print(i + ",");
        }
    }

    public static int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);
    }

    public static void merge(int arr1[], int arr2[], int n, int m) {
        int i, j, gap = n + m, tmp;

        // comparing elements in the first array.
        for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
            for (i = 0; i + gap < n; i++) {
                if (arr1[i] > arr1[i + gap]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[i + gap];
                    arr1[i + gap] = tmp;
                }
            }

            // comparing elements in both arrays.
            for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++) {
                if (arr1[i] > arr2[j]) {
                    tmp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = tmp;
                }
            }

            // comparing elements in the second array.
            if (j < m) {
                for (j = 0; j + gap < m; j++) {
                    if (arr2[j] > arr2[j + gap]) {
                        tmp = arr2[j];
                        arr2[j] = arr2[j + gap];
                        arr2[j + gap] = tmp;
                    }
                }
            }
        }
    }
}
