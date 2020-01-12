package com.example.tree.binary;

import com.example.tree.Tree;

public class DeleteNode extends Tree {


    Node deleteNode(Node root, int data) {
        // base case
        if (root == null)
            return root;

        // if data is less than data of root
        // recurse for left
        if (data < root.data)
            root.left = deleteNode(root.left, data);

            // else recurse for right
        else if (data > root.data)
            root.right = deleteNode(root.right, data);

            // if data is same as root's data, then This is the node 
            // to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.data = minValue(root.right);

            // Delete the inorder successor 
            root.right = deleteNode(root.right, root.data);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.data;
        while (root.left != null) {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
}
