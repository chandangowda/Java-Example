package com.example.tree.binary;

import com.example.tree.Tree;

public class InsertNode extends Tree {

    Node insert(Node root, int data) {
        if (root == null) {
            root = new InsertNode().new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }
}
