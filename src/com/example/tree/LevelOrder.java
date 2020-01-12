package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;


public class LevelOrder extends Tree {

    Node root;

    static void levelOrder(Node node) {
        // Base case
        if (node == null)
            return;

        // Create an empty queue for level order tarversal
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (q.isEmpty() == false) {
            // Print front of queue and remove it from queue
            node = q.peek();
            System.out.print(node.data + " ");
            q.poll();

            /*Enqueue left child*/
            if (node.left != null)
                q.add(node.left);

            /*Enqueue right child*/
            if (node.right != null)
                q.add(node.right);

        }
    }

    /* Driver program to test above functions */
    public static void main(String args[]) {
        LevelOrder tree = new LevelOrder();
        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.left = tree.new Node(4);
        tree.root.left.right = tree.new Node(5);

        System.out.println("Level order traversal of binary tree is ");
        tree.levelOrderWithSpace(tree.root);
    }

    /* Print nodes at the given level */
    void printGivenLevel(Node root, int level) {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.data + " ");
        else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }


    /* function to print level order traversal of tree*/
    void printLevelOrder() {
        int h = height(root);
        int i;
        for (i = 1; i <= h; i++)
            printGivenLevel(root, i);
    }

    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root) {
        if (root == null)
            return 0;
        else {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else return (rheight + 1);
        }
    }

    static void levelOrderWithSpace(Node node) {
        // initializing queue
        Queue<Node> q = new LinkedList<>();
        q.add(node);

        while (true) {
            int size = q.size();
            if (size == 0)
                break;
            // while queue is not empty
            while (size > 0) {
                // pick the front element from queue
                node = q.peek();

                // pop the element too
                q.poll();
                System.out.print(node.data + " ");

                // if left child exists
                // push it into exists
                if (node.left != null)
                    q.add(node.left);

                // if right child exists
                // push it into exists
                if (node.right != null)
                    q.add(node.right);
                size--;
            }
            System.out.print("$" + " ");
        }

    }

    void printSpiral(Node node) {
        if (node == null)
            return;
        int h = height(node);
        int i;

			/* ltr -> left to right. If this variable is set then the
			   given label is transversed from left to right */
        boolean ltr = false;
        for (i = 1; i <= h; i++) {
            printGivenLevel(node, i, ltr);

            /*Revert ltr to traverse next level in opposite order*/
            ltr = !ltr;
        }

    }

    void printGivenLevel(Node node, int level, boolean ltr) {
        // base case
        if (node == null)
            return;

        // when level is 1
        if (level == 1)
            System.out.print(node.data + " ");

            // when level is greater than 1
        else if (level > 1) {
            if (ltr != false) {
                // recurse for left side
                printGivenLevel(node.left, level - 1, ltr);

                // recurse for right side
                printGivenLevel(node.right, level - 1, ltr);
            } else {
                printGivenLevel(node.right, level - 1, ltr);
                printGivenLevel(node.left, level - 1, ltr);
            }
        }
    }

    /* Get width of a given level */
    int getWidth(Node root, int level) {
        // base case
        if (root == null)
            return 0;

        // 1st level
        if (level == 1)
            return 1;

            // if level is greater than 1
            // recurse for left and right with sum of width of both
        else if (level > 1)
            return getWidth(root.left, level - 1) + getWidth(root.right, level - 1);

        return 0;
    }
}
