package com.example.tree.binary;

import com.example.tree.Tree;

import java.util.Stack;

//Given two Binary Search Trees(without duplicates), you need to print the common nodes in them.
//In other words, find intersection of two BSTs.


public class BinaryInterction extends Tree {

    // Function two print common elements in given two trees
    static void printCommon(Node root1, Node root2) {
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        while (true) {
            // push the Nodes of first tree in stack s1
            if (root1 != null) {
                s1.push(root1);
                root1 = root1.left;
            }

            // push the Nodes of second tree in stack s2
            else if (root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }

            // Both root1 and root2 are NULL here
            else if (!s1.isEmpty() && !s2.isEmpty()) {
                root1 = s1.peek();
                root2 = s2.peek();

                // If current keys in two trees are same
                if (root1.data == root2.data) {
                    System.out.print(root1.data + " ");
                    s1.pop();
                    s2.pop();

                    // move to the inorder successor
                    root1 = root1.right;
                    root2 = root2.right;
                } else if (root1.data < root2.data) {
                    // If Node of first tree is smaller, than that of
                    // second tree, then its obvious that the inorder
                    // successors of current Node can have same value
                    // as that of the second tree Node. Thus, we pop
                    // from s1
                    s1.pop();
                    root1 = root1.right;

                    // root2 is set to NULL, because we need
                    // new Nodes of tree 1
                    root2 = null;
                } else if (root1.data > root2.data) {
                    s2.pop();
                    root2 = root2.right;
                    root1 = null;
                }
            }

            // Both roots and both stacks are empty
            else break;
        }
    }
}
