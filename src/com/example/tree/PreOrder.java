package com.example.tree;

public class PreOrder extends Tree {

    void preorder(Node root)
    {
        //Preorder is Data Left Right
        // Your code goes here
        if(root!=null){
            System.out.printf("%d ",root.data); //Print data
            preorder(root.left); //Recurse for left
            preorder(root.right); //Recuse for right
        }
    }
}
