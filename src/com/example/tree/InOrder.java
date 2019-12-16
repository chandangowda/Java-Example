package com.example.tree;

public class InOrder extends Tree {

    void inOrder(Node root) {
        // base case
        if (root == null) {
            return;
        }

        // recurse for left child
        inOrder(root.left);
        System.out.print(root.data + " ");
        // recurse for right child
        inOrder(root.right);
    }
}
