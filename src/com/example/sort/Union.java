package com.example.sort;

public class Union {

    public static void main(String[] args) {
        int[] arr1={1 ,1 ,1 ,1 ,1};
        int[] arr2={2 ,2 ,2 ,2 ,3};
        findUnion(arr1,arr2,arr1.length,arr2.length);
    }

    static void findUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        while (i < n && j < m) {
            while (i + 1 < n && arr1[i] == arr1[i + 1]) {
                i++;
            }
            while (j + 1 < m && arr2[j] == arr2[j + 1]) {
                j++;
            }

            if (arr1[i] < arr2[j])
                System.out.print(arr1[i++] + " ");

            else if (arr2[j] < arr1[i])
                System.out.print(arr2[j++] + " ");

            else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }


        while (i < n) {
            while (i + 1 < n && arr1[i] == arr1[i + 1])
                i++;
            System.out.print(arr1[i++] + " ");
        }

        while (j < m) {
            while (j + 1 < m && arr2[j] == arr2[j + 1])
                j++;
            System.out.print(arr2[j++] + " ");
        }
    }
}
