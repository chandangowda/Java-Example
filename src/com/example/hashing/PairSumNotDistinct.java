package com.example.hashing;

import java.util.HashSet;

/*You are given an array A[] of size N, and you are also given a sum. You need to find if two numbers in A exists
that have sum equal to the given sum.*/
public class PairSumNotDistinct {

    public static void main(String[] args) {
        int[] array={1, 2, 3, 4, 5 ,6, 7, 8, 9 ,10};
        System.out.println(sumExists(array,array.length,14));
    }

    // function to check if any pair having specified sum
    // and return 1 if so, else 0
    public static int sumExists(int arr[], int sizeOfArray, int sum)
    {

        HashSet<Integer> hs = new HashSet<>();//Using an unoredered set

        for(int i = 0; i < sizeOfArray; i++)//Iterating over the array
        {
            int temp = sum-arr[i];

            // checking for condition
            if (temp>=0 && hs.contains(temp)) //If temp exists in the array
            {

                return 1;

            }
            hs.add(arr[i]);  //insert in set
        }

        return 0;

    }
}
