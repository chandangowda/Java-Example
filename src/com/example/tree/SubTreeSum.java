package com.example.tree;

//Count Number of SubTrees having given Sum

public class SubTreeSum extends Tree {
    int c = 0;


    int countSubtreesWithSumXUtil(Node root, int x) {
        // if tree is empty
        if (root == null) return 0;

        // sum of nodes in the left subtree
        int ls = countSubtreesWithSumXUtil(root.left, x);

        // sum of nodes in the right subtree
        int rs = countSubtreesWithSumXUtil(root.right, x);


        int sum = ls + rs + root.data;

        // if tree's nodes sum == x
        if (sum == x) c++;
        return sum;
    }

    int countSubtreesWithSumX(Node root, int x) {
        // if tree is empty
        if (root == null) return 0;

        // sum of nodes in the left subtree
        int ls = countSubtreesWithSumXUtil(root.left, x);

        // sum of nodes in the right subtree
        int rs = countSubtreesWithSumXUtil(root.right, x);

        // check if above sum is equal to x
        if ((ls + rs + root.data) == x) c++;
        return c;
    }
}
