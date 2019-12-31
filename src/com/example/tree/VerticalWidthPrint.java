package com.example.tree;

import java.util.*;

//Print a Binary Tree in Vertical Order
public class VerticalWidthPrint extends Tree {

    static void verticalOrder(Node root) {
        int hd = 0;
        Queue<Node> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            int distance = temp.hd;
            if (mp.containsKey(distance)) {
                ArrayList<Integer> al = mp.get(distance);
                al.add(temp.data);
                mp.put(distance, al);
            } else {
                ArrayList<Integer> al = new ArrayList<>();
                al.add(temp.data);
                mp.put(distance, al);
            }

            if (temp.left != null) {
                temp.left.hd = distance - 1;
                q.add(temp.left);
            }
            if (temp.right != null) {
                temp.right.hd = distance + 1;
                q.add(temp.right);
            }

        }

        for (Map.Entry<Integer, ArrayList<Integer>> m : mp.entrySet()) {
            ArrayList<Integer> al = m.getValue();
            for (int i = 0; i < al.size(); i++)
                System.out.print(al.get(i) + " ");

        }
    }
}
