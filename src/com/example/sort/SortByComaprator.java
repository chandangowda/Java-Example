package com.example.sort;

import java.util.Arrays;
import java.util.Comparator;

public class SortByComaprator {

    public static void main(String[] args) {
        int[] sortByDifference={10 ,5 ,3 ,9 ,2};
        sortABS(sortByDifference,sortByDifference.length,7);
    }

    static void sortABS(int arr[], int n, int k) {
        int len = arr.length;
        Pair p[] = new Pair[len];

        // store the number with their difference with k
        for (int i = 0; i < len; i++)
            p[i] = new Pair(Math.abs(arr[i] - k), arr[i]);

        // Comparator to sort array accoding to the difference with k
        Arrays.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                // return p1 if difference with k
                // is greater than the difference of p2 with k
                return p1.x - p2.x;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++)
            sb.append(p[i].y + " ");
        System.out.print(sb);

    }
}

class Pair
{
    int x, y;

    // pair to store the values and
    // their difference with k
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
