package com.example.tree;

public class MaximumDiameter extends Tree {

    /* Computes the number of nodes in a tree. */
    int height(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + Math.max(height(node.left), height(node.right));
    }


    /* Function to get diameter of a binary tree */
    int diameter(Node node) {
        /* base case where tree is empty */
        if (node == null)
            return 0;

        /* get the height of left and right sub-trees */
        int lheight = height(node.left);
        int rheight = height(node.right);

        /* get the diameter of left and right sub-trees */
        int ldiameter = diameter(node.left);
        int rdiameter = diameter(node.right);

        /* Return max of following three
         1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */
        return Math.max(lheight + rheight + 1, Math.max(ldiameter, rdiameter));
    }
}
