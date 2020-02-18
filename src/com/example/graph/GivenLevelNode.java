package com.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*Given an undirected graph of N edges and a node X is given.
The task is to find the level of X. if X does not exist in the graph then print -1.*/
public class GivenLevelNode {

    static int levels(ArrayList<ArrayList<Integer>> list, int x, int in) {
        int level[] = new int[100001];
        boolean visited[] = new boolean[100001];

        Arrays.fill(level, 0);

        Queue<Integer> q = new LinkedList<>();
        q.add(x);               // Add the current node to queue

        visited[x] = true;      // Mark the current node as visited
        level[x] = 0;           // The level of current node is zero. (root node)

        while (!q.isEmpty()) {    // Keep on running the loop till queue is empty

            x = q.peek();       // Get the front of the queue

            q.poll();

            for (int i = 0; i < list.get(x).size(); i++) {    // Run loop for the adjacent nodes of the current front
                int b = list.get(x).get(i);

                if (!visited[b]) {        // If node is not visited
                    q.add(b);           // Add the node to the queue
                    level[b] = level[x] + 1;  // Increase the level of adjacent node by 1 from the current node
                    visited[b] = true;      // Mark the visited node as true for the current node
                }

            }

        }

        return level[in];
    }
}
