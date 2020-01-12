package com.example.tree.binary;

import com.example.tree.Tree;

public class SearchTree extends Tree {

    boolean search(Node root, int x) {
        // base case
        if (root == null)
            return false;

        // if data of root
        // is equal to x
        if (root.data == x)
            return true;

        // recurse for right subtree when root->data
        // is less than x
        if (x > root.data) {
            return search(root.right, x);
        }

        // else recurse for left subtree
        else
            return search(root.left, x);
    }
}
