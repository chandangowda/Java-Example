package com.example.tree;

public class LeftNode extends Tree {

    Node root;

    int max_level = 0;

    // Util function to get the left view
    void leftViewUtil(Node node, int level) {
        // base case
        if (node == null) return;

        // If this is the first node of its level
        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }

        // Recur for left and right subtrees
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }

    // Function to get the left view
    void leftView(Node root) {
        leftViewUtil(root, 1);
    }

    /* testing for example nodes */
    public static void main(String args[])
    {
        /* creating a binary tree and entering the nodes */
        LeftNode tree = new LeftNode();
        tree.root = tree.new Node(12);
        tree.root.left = tree.new Node(10);
        tree.root.right = tree.new Node(30);
        tree.root.right.left = tree.new Node(25);
        tree.root.right.right = tree.new Node(40);

        tree.leftView(tree.root);


    }
}
