package com.example.tree;

public class Subtree extends Tree {

    public static boolean areIdentical(Node root1, Node root2) {
        // base case
        if (root1 == null && root2 == null) return true;

        // if any of the root is null
        if (root1 == null || root2 == null) return false;

        // recurse for left and right subtree
        return (root1.data == root2.data &&
                areIdentical(root1.left, root2.left) &&
                areIdentical(root1.right, root2.right));
    }

    /* This function returns true if S is a subtree of T, otherwise false */
    public static boolean isSubtree(Node T, Node S) {
        /* base cases */
        if (S == null) return true;

        if (T == null) return false;

        /* Check the tree with root as current node */
        if (areIdentical(T, S)) return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
}
