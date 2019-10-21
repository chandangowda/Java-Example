package com.example.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] bubbleSort={6,8,1,2,9,2};
        sort(bubbleSort);
        Arrays.stream(bubbleSort).forEach(System.out::print);
    }

    public static void sort(int[] sort){

        for(int i =0;i<sort.length;i++){
            for(int j=0;j<sort.length-1-i;j++){
                if(sort[j+1]<sort[j]){
                    int temp=sort[j+1];
                    sort[j+1]=sort[j];
                    sort[j]=temp;
                }
            }
        }
    }

}
