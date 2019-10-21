package com.example.sort;

public class Sort012 {

    public static void main(String[] args) {
        int[] segragate={0 ,2 ,1, 2 ,0};
        segragate012(segragate,segragate.length);
        for (int i:segragate){
            System.out.print(i+",");
        }
    }

    public static void segragate012(int a[], int n) {
        int low = 0, high = n - 1, mid = 0;
        while (mid <= high) {

            // if element is 0, push that to low
            if (a[mid] == 0) {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }

            // if element is 1, push that to mid
            else if (a[mid] == 1) {
                mid++;
            }

            // if element is 2, push that to last
            else {
                int temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }
}
