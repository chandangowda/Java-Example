package com.example.tree;

import java.util.HashSet;

//Vertical Width of a Binary Tree
public class VerticalWidth extends Tree {

    public static HashSet<Integer> s = new HashSet<Integer>();


    public static void find(Node root, int l) {
        // base case
        if (root == null)
            return;

        // add the distance to set
        s.add(l);

        // recurse for left and right subtrees
        find(root.left, l - 1);
        find(root.right, l + 1);
    }

    public static int verticalWidth(Node root) {
        if (root == null)
            return 0;
        find(root, 0);
        return s.size();
    }
}
