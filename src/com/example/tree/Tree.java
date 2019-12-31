package com.example.tree;

public abstract class Tree {

    class Node {

        public Node nextRight;
        int data;
        Node left, right;
        int hd;

        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
}
