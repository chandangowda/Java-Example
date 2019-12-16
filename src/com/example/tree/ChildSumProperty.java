package com.example.tree;


public class ChildSumProperty extends Tree {
    Node root1, root2;

    public static int isSumProperty(Node node) {
        int left_data = 0;
        int right_data = 0;

        // base case
        if (node == null || (node.left == null && node.right == null))
            return 1;

        else {
            // if left child is not null
            // then store the value in left_Data
            if (node.left != null)
                left_data = node.left.data;

            // if right child is not null
            // then store the value in right_data
            if (node.right != null)
                right_data = node.right.data;

            // if stored data of left and right child
            // is equal to the current node data
            // then this will return true
            // So, recurse for left and right node
            if ((node.data == left_data + right_data) &&
                    (isSumProperty(node.left) != 0 && isSumProperty(node.right) != 0))
                return 1;
            else
                return 0;

        }

    }

    /* driver program to test the above functions */
    public static void main(String[] args) {
        ChildSumProperty tree = new ChildSumProperty();
        tree.root1 = tree.new Node(10);
        tree.root1.left = tree.new Node(8);
        tree.root1.right = tree.new Node(2);
        tree.root1.left.left = tree.new Node(3);
        tree.root1.left.right = tree.new Node(5);
        tree.root1.right.right = tree.new Node(2);
        if (tree.isSumProperty(tree.root1) != 0)
            System.out.println("The given tree satisfies children"
                    + " sum property");
        else
            System.out.println("The given tree does not satisfy children"
                    + " sum property");
    }
}
