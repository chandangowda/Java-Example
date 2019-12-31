package com.example.tree;


import java.util.ArrayList;
import java.util.List;

public class SerailizationAndDesrialization extends Tree {

    List<Integer> serialized=new ArrayList<>();

    public void serialize(Node root){
        if(root==null){
            serialized.add(-1);
        }
        serialized.add(root.data);
        serialize(root.left);
        serialize(root.right);
    }

    int index=0;

    public Node deserialize(int[] serializedArray){
        if(index == serializedArray.length || serializedArray[index]==-1){
            index++;
            return null;
        }
        Node root=new Node(serializedArray[index]);
        index++;
        root.left=deserialize(serializedArray);
        root.right=deserialize(serializedArray);
        return  root;
    }
}
