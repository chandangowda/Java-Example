package com.example.tree.binary;

import com.example.tree.Tree;

public class Range extends Tree {

    public static int total(Node root, int l, int h) {
        // base case
        if (root == null)
            return 0;

        int count = 0;

        // check if data of root lies in range of l and h
        if (root.data >= l && root.data <= h)
            count++;

        // recurse for left and right
        return count + total(root.left, l, h) + total(root.right, l, h);
    }

    public static int getCountOfNode(Node root, int l, int h) {
        // base case
        if (root == null)
            return 0;

        return total(root, l, h);
    }
}
