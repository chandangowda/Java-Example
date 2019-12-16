package com.example.tree;

public abstract class Tree {

    class Node {

        int data;
        Node left, right;

        Node(int item)    {
            data = item;
            left = right = null;
        }
    }
}
