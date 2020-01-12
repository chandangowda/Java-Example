package com.example.tree.binary;

import com.example.tree.Tree;

public class InclusiveRagePrint extends Tree {

    void printNearNodes(Node node, int k1, int k2) {

        /* base case */
        if (node == null) {
            return;
        }
 
        /* Since the desired o/p is sorted, recurse for left subtree first
         If root->data is greater than k1, then only we can get o/p datas
         in left subtree */
        if (k1 < node.data) {
            printNearNodes(node.left, k1, k2);
        }

        /* if root's data lies in range, then prints root's data */
        if (k1 <= node.data && k2 >= node.data) {
            System.out.print(node.data + " ");
        }
 
        /* If root->data is smaller than k2, then only we can get o/p datas
         in right subtree */
        if (k2 > node.data) {
            printNearNodes(node.right, k1, k2);
        }
    }
}
