package com.example.tree.binary;

import com.example.tree.Tree;

/*Given an array arr[] of N positive integers to be inserted into BST and a positive integer X.
The task is to find floor of X in the BST.Floor(X) is an element that is either equal to X or immediately smaller to X.*/
public class FloorTree extends Tree {

    int floor(Node root, int key) {

        // base case
        if (root == null)
            return Integer.MAX_VALUE;

        // check if data is equal to key
        if (root.data == key) return root.data;

        // recurse left if data is greater than key
        if (root.data > key) return floor(root.left, key);

        // else recurse for right
        int floorValue = floor(root.right, key);

        // if floorValue is less than or equal to key
        // then return this value
        if (floorValue <= key) return floorValue;

            // else return the data of root itself
        else return root.data;
    }
}
