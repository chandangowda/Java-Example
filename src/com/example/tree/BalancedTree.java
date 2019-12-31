package com.example.tree;

public class BalancedTree extends Tree {

    Node root;

    // function to check if tree is balanced
    boolean isBalanced(Node root) {
        int lh;
        int rh;


        // base case
        if (root == null)
            return true;

        // height of left subtree
        lh = height(root.left);

        // height of right subtree
        rh = height(root.right);

        // if difference between left and right height of the tree is 1 (absolute value)
        // then it will return true and now recurse to check left and right subtree
        // is balanced or not
        if (Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right))
            return true;

        return false;
    }

    int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    // Function to find height of tree
    int height(Node root) {
        if (root == null)
            return 0;

        // recurse for left and right height of subtree
        // and add 1 to it which includes the root itself
        return (1 + max(height(root.left), height(root.right)));
    }

    public static void main(String args[])
    {
        BalancedTree tree = new BalancedTree();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right =tree. new Node(5);
        tree.root.left.left.left = tree.new Node(8);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }
}
