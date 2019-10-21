package com.example.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] insertarray={4,3,2,10,12,1,5,6,1};
        insertonSort(insertarray);
        Arrays.stream(insertarray).forEach(System.out::print);
    }

    public static void insertonSort(int[] sort){

        for(int i=1;i<sort.length;i++){
            int key=sort[i];
            int j=i-1;
            while(j>=0 && sort[j]>key){
                sort[j+1]=sort[j];
                j--;
            }
            sort[j+1]=key;
        }
    }
}
