package com.example.tree;

public class RightView extends Tree {

    Max_level max = new Max_level();

    void rightViewUtil(Node node, int level, Max_level max_level) {

        // base case
        if (node == null)
            return;

        // If this is the last Node of its level
        if (max_level.max_level < level) {
            System.out.print(node.data + " ");
            max_level.max_level = level;
        }

        // recurse for left and right subtree
        rightViewUtil(node.right, level + 1, max_level);
        rightViewUtil(node.left, level + 1, max_level);
    }

    void rightView(Node node) {
        rightViewUtil(node, 1, max);
    }
}

class Max_level {
    int max_level;
}
