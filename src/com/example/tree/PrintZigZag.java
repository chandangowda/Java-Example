package com.example.tree;

import java.util.Stack;

public class PrintZigZag extends Tree {

    Node rootNode;

    // function to print the 
// zigzag traversal 
    void printZigZagTraversal() {

        // if null then return 
        if (rootNode == null) {
            return;
        }

        // declare two stacks 
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        // push the root 
        currentLevel.push(rootNode);
        boolean leftToRight = true;

        // check if stack is empty 
        while (!currentLevel.isEmpty()) {

            // pop out of stack 
            Node node = currentLevel.pop();

            // print the data in it 
            System.out.print(node.data + " ");

            // store data according to current 
            // order. 
            if (leftToRight) {
                if (node.left != null) {
                    nextLevel.push(node.left);
                }

                if (node.right != null) {
                    nextLevel.push(node.right);
                }
            } else {
                if (node.right != null) {
                    nextLevel.push(node.right);
                }

                if (node.left != null) {
                    nextLevel.push(node.left);
                }
            }

            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }
        }
    }

    // driver program to test the above function 
    public static void main(String[] args) {
        PrintZigZag tree = new PrintZigZag();
        tree.rootNode = tree.new Node(1);
        tree.rootNode.left = tree.new Node(2);
        tree.rootNode.right = tree.new Node(3);
        tree.rootNode.left.left = tree.new Node(7);
        tree.rootNode.left.right = tree.new Node(6);
        tree.rootNode.right.left = tree.new Node(5);
        tree.rootNode.right.right = tree.new Node(4);

        System.out.println("ZigZag Order traversal of binary tree is");
        tree.printZigZagTraversal();
    }
}
