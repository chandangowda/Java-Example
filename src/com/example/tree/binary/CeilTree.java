package com.example.tree.binary;

import com.example.tree.Tree;

public class CeilTree extends Tree {

    int findCeil(Node root, int key) {
        // base case
        if (root == null)
            return -1;

        // if data of root is equal to key
        if (root.data == key) return root.data;

        // if data of root is less than key
        // recurse for right subtree
        if (root.data < key) return findCeil(root.right, key);

        // recurse right and find if ceil exists
        int ceilValue = findCeil(root.left, key);

        // check the ceilValue and return if greater than equal to key
        if (ceilValue >= key) return ceilValue;

            // else return data of root
        else return root.data;
    }
}
