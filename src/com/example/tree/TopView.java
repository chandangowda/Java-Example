package com.example.tree;


import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class qObj extends Tree {
    Node node;
    int level;

    qObj(Node n, int l) {
        node = n;
        level = l;
    }
}

public class TopView extends Tree {

    Node root;

    public static void topView(Node root) {
        Queue<qObj> q = new LinkedList<qObj>();
        q.add(new qObj(root, 1));
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

        // doing level order traversal and finding the extreme elements
        while (!q.isEmpty()) {
            qObj popped = q.poll();
            if (!map.containsKey(popped.level))
                map.put(popped.level, popped.node.data);
            if (popped.node.left != null)
                q.add(new qObj(popped.node.left, popped.level - 1));
            if (popped.node.right != null)
                q.add(new qObj(popped.node.right, popped.level + 1));
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.print(e.getValue() + " ");
        }

    }


    // Driver Program to test above functions
    public static void main(String[] args) {
        /* Create following Binary Tree
            1
        / \
        2 3
        \
            4
            \
            5
            \
                6*/
        TopView tree = new TopView();
        tree.root =tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.right = tree.new Node(4);
        tree.root.left.right.right =tree. new Node(5);
        tree.root.left.right.right.right = tree.new Node(6);
        System.out.println("Following are nodes in top view of Binary Tree");
        tree.topView(tree.root);
    }

}
