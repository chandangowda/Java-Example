package com.example;

public class BinaryTwoRpeatedElement {

    public static void main(String[] args) {
        int[] a={1,2,1,3,4,3};
        twoRepeated(a,a.length-2);
    }

    static void twoRepeated(int arr[], int n){

        // iterating over the array elements
        for(int p=0;p<n+2;p++){

            // check if the element is visited or not
            // if not, then make it negative
            if(arr[Math.abs(arr[p])] > 0){
                arr[Math.abs(arr[p])] = -arr[Math.abs(arr[p])];
            }
            // else, if it is already visited, then print the element
            // it means it is repeated
            else{
                System.out.print(Math.abs(arr[p])+" ");
            }
        }


    }
}
