package com.example.sort;

public class Intersection {

    public static void main(String[] args) {
        int[] arr1={1 ,2 ,2 ,3 ,4};
        int[] arr2={2 ,2 ,4 ,6 ,7 ,8};
    }

    /* Function prints Intersection of arr1[] and arr2[]
   n is the number of elements in arr1[]
   m is the number of elements in arr2[] */
    static void printIntersection(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;
        boolean flag = false;
        StringBuffer sb = new StringBuffer();
        while (i < n && j < m) {
            if (i > 0 && arr1[i - 1] == arr1[i]) {
                i++;
                continue;
            }
            if (arr1[i] < arr2[j])
                i++;
            else if (arr2[j] < arr1[i])
                j++;
            else {
                sb.append(arr2[j] + " ");
                flag = true;
                i++;
                j++;
            }
        }

        if (flag == false)
            System.out.print("-1");
        else System.out.print(sb);
    }
}
