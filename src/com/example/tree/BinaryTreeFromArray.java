package com.example.tree;


/*Given an array of size N that represents a Tree in such a way that array indexes are values in
        tree nodes and array values give the parent node of that particular index(or node).
        The value of the root node index would always be-1as there is no parent for root.
        Construct the standard linked representation of Binary Tree from this array representation.*/

public class BinaryTreeFromArray {

    static Node root;

    public static Node createTree(int arr[], int n) {
        root = null;
        Node[] created = new Node[n];
        for (int i = 0; i < n; i++)
            created[i] = null;

        for (int i = 0; i < n; i++)
            createNode(arr, i, created);

        return root;
    }

    public static void createNode(int arr[], int i, Node created[]) {
        if (created[i] != null)
            return;


        created[i] = new Node(i);


        if (arr[i] == -1) {
            root = created[i];
            return;
        }


        if (created[arr[i]] == null)
            createNode(arr, arr[i], created);


        Node p = created[arr[i]];


        if (p.left == null)
            p.left = created[i];
        else

            p.right = created[i];
    }
}
