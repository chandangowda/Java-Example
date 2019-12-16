package com.example.tree;

public class IdentityTree extends Tree {
    Node root1, root2;

    /* Given two trees, return true if they are
       structurally identical */
    boolean identicalTrees(Node a, Node b) {
        /*1. both empty */
        if (a == null && b == null)
            return true;

        /* 2. both non-empty -> compare them */
        if (a != null && b != null)
            return (a.data == b.data
                    && identicalTrees(a.left, b.left)
                    && identicalTrees(a.right, b.right));

        /* 3. one empty, one not -> false */
        return false;
    }

    /* Driver program to test identicalTrees() function */
    public static void main(String[] args) {
        IdentityTree tree = new IdentityTree();

        tree.root1 = tree.new Node(1);
        tree.root1.left = tree.new Node(2);
        tree.root1.right = tree.new Node(3);
        tree.root1.left.left = tree.new Node(4);
        tree.root1.left.right = tree.new Node(5);

        tree.root2 = tree.new Node(1);
        tree.root2.left = tree.new Node(2);
        tree.root2.right = tree.new Node(3);
        tree.root2.left.left = tree.new Node(4);
        tree.root2.left.right = tree.new Node(5);

        if (tree.identicalTrees(tree.root1, tree.root2))
            System.out.println("Both trees are identical");
        else
            System.out.println("Trees are not identical");

    }
}
