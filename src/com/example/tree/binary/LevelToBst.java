package com.example.tree.binary;

import com.example.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelToBst extends Tree {

    public static void main(String[] args) {
        int[] preOrder={7 ,4 ,12 ,3, 6, 8 ,1 ,5 ,10};
        LevelToBst bst=new LevelToBst();
        Node root= bst.constructBST(preOrder);
        bst.inorderTraversal(root);
    }
    // function to print the inorder traversal
     void inorderTraversal(Node root)
    {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print( root.data + " ");
        inorderTraversal(root.right);
    }
    class QNode {
        Node node;
        int min, max;

        public QNode(Node node) {
            this.node = node;
            this.min = Integer.MIN_VALUE;
            this.max = Integer.MAX_VALUE;
        }

    }

    public Node constructBST(int[] arr) {
        Node root = new Node(arr[0]);

        Queue<QNode> q = new LinkedList<>();
        q.add(new QNode(root));

        QNode curr;

        // traverse the array elements and using method of level order traversal
        // to construct BST
        for (int i = 1; i < arr.length; ) {
            curr = q.poll();

            if (i < arr.length && arr[i] < curr.node.data && arr[i] > curr.min) {
                Node leftNode = new Node(arr[i]);
                curr.node.left = leftNode;

                QNode newQnode = new QNode(leftNode);
                newQnode.min = curr.min;
                newQnode.max = curr.node.data;

                q.add(newQnode);
                i++;
            }

            if (i < arr.length && arr[i] > curr.node.data && arr[i] < curr.max) {
                Node rightNode = new Node(arr[i]);
                curr.node.right = rightNode;

                QNode newQnode = new QNode(rightNode);
                newQnode.min = curr.node.data;
                newQnode.max = curr.max;

                q.add(newQnode);
                i++;
            }

        }
        return root;
    }

}
