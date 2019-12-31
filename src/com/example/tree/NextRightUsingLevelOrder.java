package com.example.tree;

import java.util.LinkedList;
import java.util.Queue;

public class NextRightUsingLevelOrder extends Tree {

    // Sets nextRight of all nodes of a tree
    static void connect(Node root) {
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // null marker to represent end of current level
        q.add(null);

        // Do Level order of tree using NULL markers
        while (!q.isEmpty()) {
            Node p = q.peek();
            q.remove();
            if (p != null) {

                // next element in queue represents next
                // node at current Level
                p.nextRight = q.peek();

                // push left and right children of current
                // node
                if (p.left != null)
                    q.add(p.left);
                if (p.right != null)
                    q.add(p.right);
            }

            // if queue is not empty, push NULL to mark
            // nodes at this level are visited
            else if (!q.isEmpty())
                q.add(null);
        }
    }

    /* Driver program to test above functions*/
    public static void main(String args[]) {

        /* Constructed binary tree is
                  10
                /   \
              8      2
            /         \
          3            90
        */
        NextRightUsingLevelOrder levelOrder = new NextRightUsingLevelOrder();
        Node root = levelOrder.new Node(10);
        root.left = levelOrder.new Node(8);
        root.right = levelOrder.new Node(2);
        root.left.left = levelOrder.new Node(3);
        root.right.right = levelOrder.new Node(90);

        // Populates nextRight pointer in all nodes
        connect(root);

        // Let us check the values of nextRight pointers
        System.out.println("Following are populated nextRight pointers in \n" +
                "the tree (-1 is printed if there is no nextRight)");
        System.out.println("nextRight of " + root.data + " is " +
                ((root.nextRight != null) ? root.nextRight.data : -1));
        System.out.println("nextRight of " + root.left.data + " is " +
                ((root.left.nextRight != null) ? root.left.nextRight.data : -1));
        System.out.println("nextRight of " + root.right.data + " is " +
                ((root.right.nextRight != null) ? root.right.nextRight.data : -1));
        System.out.println("nextRight of " + root.left.left.data + " is " +
                ((root.left.left.nextRight != null) ? root.left.left.nextRight.data : -1));
        System.out.println("nextRight of " + root.right.right.data + " is " +
                ((root.right.right.nextRight != null) ? root.right.right.nextRight.data : -1));
    }

    /* Set next right of all descendents of p.
       Assumption:  p is a compete binary tree */
    void connectRecurForCompleteBinaryTree(Node p) {
        // Base case
        if (p == null)
            return;

        // Set the nextRight pointer for p's left child
        if (p.left != null)
            p.left.nextRight = p.right;

        // Set the nextRight pointer for p's right child
        // p->nextRight will be NULL if p is the right most child
        // at its level
        if (p.right != null)
            p.right.nextRight = (p.nextRight != null) ?
                    p.nextRight.left : null;

        // Set nextRight for other nodes in pre order fashion
        connectRecurForCompleteBinaryTree(p.left);
        connectRecurForCompleteBinaryTree(p.right);
    }

    /* Set next right of all descendents of p. This function makes sure that
       nextRight of nodes ar level i is set before level i+1 nodes. */
    void connectRecurForNonComplete(Node p) {
        // Base case
        if (p == null)
            return;

        /* Before setting nextRight of left and right children, set nextRight
           of children of other nodes at same level (because we can access
           children of other nodes using p's nextRight only) */
        if (p.nextRight != null)
            connectRecurForNonComplete(p.nextRight);

        /* Set the nextRight pointer for p's left child */
        if (p.left != null) {
            if (p.right != null) {
                p.left.nextRight = p.right;
                p.right.nextRight = getNextRight(p);
            } else
                p.left.nextRight = getNextRight(p);

            /* Recursively call for next level nodes.  Note that we call only
             for left child. The call for left child will call for right child */
            connectRecurForNonComplete(p.left);
        }

        /* If left child is NULL then first node of next level will either be
         p->right or getNextRight(p) */
        else if (p.right != null) {
            p.right.nextRight = getNextRight(p);
            connectRecurForNonComplete(p.right);
        } else
            connectRecurForNonComplete(getNextRight(p));
    }

    /* This function returns the leftmost child of nodes at the same
       level as p. This function is used to getNExt right of p's right child
       If right child of p is NULL then this can also be used for
       the left child */
    Node getNextRight(Node p) {
        Node temp = p.nextRight;

        /* Traverse nodes at p's level and find and return
         the first node's first child */
        while (temp != null) {
            if (temp.left != null)
                return temp.left;
            if (temp.right != null)
                return temp.right;
            temp = temp.nextRight;
        }

        // If all the nodes at p's level are leaf nodes then return NULL
        return null;
    }

    /* Sets nextRight of all nodes of a tree with root as p */
    void connectUsingIterative(Node p) {
        Node temp = null;

        if (p == null)
            return;

        // Set nextRight for root
        p.nextRight = null;

        // set nextRight of all levels one by one
        while (p != null) {
            Node q = p;

            /* Connect all childrem nodes of p and children nodes of all other
               nodes at same level as p */
            while (q != null) {
                // Set the nextRight pointer for p's left child
                if (q.left != null) {

                    // If q has right child, then right child is nextRight of
                    // p and we also need to set nextRight of right child
                    if (q.right != null)
                        q.left.nextRight = q.right;
                    else
                        q.left.nextRight = getNextRight(q);
                }

                if (q.right != null)
                    q.right.nextRight = getNextRight(q);

                // Set nextRight for other nodes in pre order fashion
                q = q.nextRight;
            }

            // start from the first node of next level
            if (p.left != null)
                p = p.left;
            else if (p.right != null)
                p = p.right;
            else
                p = getNextRight(p);
        }

    }

}