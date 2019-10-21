package com.example.hashing;

import java.util.HashSet;


/*You are given an array A (distinct integers) of size N, and you are also given a sum.
You need to find if two numbers in A exists that have sum equal to the given sum.*/
public class PairSum {

    public static void main(String[] args) {
        int[] array={1 ,2 ,3 ,4 ,5 ,6, 7, 8, 9, 10};
        System.out.println(sumExists(array,array.length,14));
    }

    public static int sumExists(int arr[], int sizeOfArray, int sum) {
        HashSet<Integer> st = new HashSet<Integer>();//using an unorered set
        for (int i = 0; i < sizeOfArray; i++)
            st.add(arr[i]);//Inserting all elements in the set

        for (int i = 0; i < sizeOfArray; i++) {
            if (sum - arr[i] == arr[i]) //Taking care of cases like 4-2=2 as two 2's cannot exist in distinct array
                continue;
            else {
                if (st.contains(sum - arr[i])) {
                    return 1;//If we find the pair return 1
                }
            }
        }
        return 0; //return 0
    }
}
