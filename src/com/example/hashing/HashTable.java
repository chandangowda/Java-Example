package com.example.hashing;

import java.util.ArrayList;


/*Separate chaining technique in hashing allows to us to use a linked list at each hash slot to handle the problem of collisions.
That is, every slot of the hash table is a linked list,
 so whenever a collision occurs, the element can be appened as a node to the linked list at the slot.*/
public class HashTable {

    public static void main(String[] args) {
        int[] array={92 ,4 ,14 ,24 ,44 ,91};

    }

    public static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize){
        int tmpIndx;
        for(int i=0; i<n; i++) {
            tmpIndx = arr[i]%hashSize;
            hashTable.get(tmpIndx).add(arr[i]);//pushing element arr[i] in the arrayList hashTable at position arr[i]%hashSize
        }
    }
}
