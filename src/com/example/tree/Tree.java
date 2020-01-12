package com.example.tree;

public abstract class Tree {

    public class Node {

        public Node nextRight;
        public int data;
        public Node left, right;
        int hd;

        public Node(int item)    {
            data = item;
            left = right = null;
        }
    }
}
