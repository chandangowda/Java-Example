package com.example.tree;

public class TreeFold extends Tree {

    Node root;

    /* Returns true if the given tree is foldable */
    boolean isFoldable(Node node) {
        boolean res;

        /* base case */
        if (node == null)
            return true;

        /* convert left subtree to its mirror */
        mirror(node.left);

        /* Compare the structures of the right subtree and mirrored
         left subtree */
        res = isStructSame(node.left, node.right);

        /* Get the originial tree back */
        mirror(node.left);

        return res;
    }

    boolean isStructSame(Node a, Node b) {
        if (a == null && b == null)
            return true;
        if (a != null && b != null
                && isStructSame(a.left, b.left)
                && isStructSame(a.right, b.right))
            return true;

        return false;
    }

    /* UTILITY FUNCTIONS */

    /* Change a tree so that the roles of the  left and
       right pointers are swapped at every node.
       See https:// www.geeksforgeeks.org/?p=662 for details */
    void mirror(Node node) {
        if (node == null)
            return;
        else {
            Node temp;

            /* do the subtrees */
            mirror(node.left);
            mirror(node.right);

            /* swap the pointers in this node */
            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        TreeFold tree = new TreeFold();

        /* The constructed binary tree is
             1
           /   \
          2     3
           \    /
            4  5
        */
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.right.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);

        if (tree.isFoldable(tree.root))
            System.out.println("tree is foldable");
        else
            System.out.println("Tree is not foldable");
    }

    /* Returns true if the given tree can be folded */
    boolean IsFoldable(Node node) {
        if (node == null)
            return true;

        return IsFoldableUtil(node.left, node.right);
    }

    /* A utility function that checks if trees with roots as n1 and n2
     are mirror of each other */
    boolean IsFoldableUtil(Node n1, Node n2) {

        /* If both left and right subtrees are NULL,
         then return true */
        if (n1 == null && n2 == null)
            return true;

        /* If one of the trees is NULL and other is not,
         then return false */
        if (n1 == null || n2 == null)
            return false;

        /* Otherwise check if left and right subtrees are mirrors of
         their counterparts */
        return IsFoldableUtil(n1.left, n2.right)
                && IsFoldableUtil(n1.right, n2.left);
    }

}
