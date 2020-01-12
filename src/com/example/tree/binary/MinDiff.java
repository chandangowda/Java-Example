package com.example.tree.binary;

import com.example.tree.Tree;

public class MinDiff extends Tree {

    // Function to find node with minimum absolute
    // difference with given K
    // min_diff   -. minimum difference till now
    // min_diff_key  -. node having minimum absolute
    //                   difference with K
    static int min_diff, min_diff_key;

    static void maxDiffUtil(Node ptr, int k) {
        if (ptr == null)
            return;

        // If k itself is present
        if (ptr.data == k) {
            min_diff_key = k;
            return;
        }

        // update min_diff and min_diff_key by checking
        // current node value
        if (min_diff > Math.abs(ptr.data - k)) {
            min_diff = Math.abs(ptr.data - k);
            min_diff_key = ptr.data;
        }

        // if k is less than ptr.data then move in
        // left subtree else in right subtree
        if (k < ptr.data)
            maxDiffUtil(ptr.left, k);
        else
            maxDiffUtil(ptr.right, k);
    }

    // Wrapper over maxDiffUtil()
    static int maxDiff(Node root, int k) {
        // Initialize minimum difference
        min_diff = Integer.MAX_VALUE;
        min_diff_key = -1;

        // Find value of min_diff_key (Closest data
        // in tree with k)
        maxDiffUtil(root, k);

        return Math.abs(min_diff_key - k);
    }
}
