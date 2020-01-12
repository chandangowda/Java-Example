package com.example.tree.binary;

import com.example.tree.Tree;

import java.util.HashSet;

public class PairExists extends Tree {

    static HashSet<Integer> set = new HashSet<>();

    static boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {

        // base case
        if (root == null) return false;

        // recurse for left subtree
        if (findpairUtil(root.left, sum, set) == true) return true;

        // check if pair exists in the BST
        if (set.contains(sum - root.data) == true) {
            return true;
        } else
            set.add(root.data);

        // recurse for the right subtree
        return findpairUtil(root.right, sum, set);
    }

    static boolean findPair(Node root, int sum) {
        set = new HashSet<Integer>();

        if (findpairUtil(root, sum, set)) return true;

        return false;
    }
}
