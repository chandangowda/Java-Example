package com.example.sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] selectionarray={4,3,2,10,12,1,5,6,1};
        slelctionsort(selectionarray);
        Arrays.stream(selectionarray).forEach(e -> System.out.print(e +" "));
    }

    public static void slelctionsort(int[] sort){
        for(int i=0;i<sort.length-1;i++){
            int min_index=i;
            for(int j=i+1;j<sort.length;j++){
                if(sort[j]<sort[min_index]){
                    min_index=j;
                }
            }
            int temp=sort[i];
            sort[i]=sort[min_index];
            sort[min_index]=temp;
        }
    }
}
