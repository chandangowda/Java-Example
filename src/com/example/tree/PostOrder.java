package com.example.tree;

public class PostOrder extends Tree {

    void postOrder(Node root) {
        if (root != null) {
            // recurse for left child
            postOrder(root.left);
            // recurse for right child
            postOrder(root.right);

            // print the root data
            System.out.print(root.data + " ");
        }
    }
}
