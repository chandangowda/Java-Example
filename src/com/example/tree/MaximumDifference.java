package com.example.tree;


//Maximum difference between node and its ancestor in Binary Tree

public class MaximumDifference extends Tree {

    Node root;

    /* Recursive function to calculate maximum ancestor-node 
       difference in  binary tree. It updates value at 'res' 
       to store the result.  The returned value of this function 
       is minimum value in subtree rooted with 't' */
    int maxDiffUtil(Node t, Res res) { 
        /* Returning Maximum int value if node is not 
           there (one child case)  */
        if (t == null)
            return Integer.MAX_VALUE;

        /* If leaf node then just return node's value  */
        if (t.left == null && t.right == null)
            return t.data; 
   
        /* Recursively calling left and right subtree 
           for minimum value  */
        int val = Math.min(maxDiffUtil(t.left, res),
                maxDiffUtil(t.right, res)); 
   
        /* Updating res if (node value - minimum value 
           from subtree) is bigger than res  */
        res.val = Math.max(res.val, t.data - val);

        /* Returning minimum value got so far */
        return Math.min(val, t.data);
    }

    /* This function mainly calls maxDiffUtil() */
    int maxDiff(Node root) {
        // Initialising result with minimum int value 
        Res res = new Res();
        res.val = Integer.MIN_VALUE;
        maxDiffUtil(root, res);

        return res.val;
    }

    /* Helper function to print inorder traversal of 
       binary tree   */
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + "");
            inorder(root.right);
        }
    }

    // Driver program to test the above functions 
    public static void main(String[] args) {
        MaximumDifference tree = new MaximumDifference();

        // Making above given diagram's binary tree 
        tree.root = tree.new Node(8);
        tree.root.left = tree.new Node(3);
        tree.root.left.left = tree.new Node(1);
        tree.root.left.right = tree.new Node(6);
        tree.root.left.right.left = tree.new Node(4);
        tree.root.left.right.right = tree.new Node(7);

        tree.root.right = tree.new Node(10);
        tree.root.right.right = tree.new Node(14);
        tree.root.right.right.left = tree.new Node(13);

        System.out.println("Maximum difference between a node and"
                + " its ancestor is : " + tree.maxDiff(tree.root));
    }
}

