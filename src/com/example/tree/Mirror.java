package com.example.tree;


//Mirror Tree
public class Mirror extends Tree {

    void mirror(Node node) {
        if (node == null)
            return;
        else {
            Node temp;

            mirror(node.left);
            mirror(node.right);

            temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
    }
}
