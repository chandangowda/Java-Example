package com.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class PathCount {

    static int countPathsUtil(ArrayList<ArrayList<Integer>> list, int u, int d, boolean visited[], int pathCount) {
        visited[u] = true;      // Mark the visited for current node as true
        if (u == d)               // If current node is equal to destination node increase the path count
            pathCount++;
        else {
            Iterator<Integer> it = list.get(u).iterator();
            while (it.hasNext()) // Run for the adjacent nodes of the current node
            {
                int n = it.next();
                if (!visited[n]) // If current node is not visited
                {
                    pathCount = countPathsUtil(list, n, d, visited, pathCount);  // Call the function for adjacent node
                }
            }
        }
        visited[u] = false; // Mark visited false for the current node
        return pathCount;
    }

    static int countPaths(ArrayList<ArrayList<Integer>> list, int s, int d) {
        boolean visited[] = new boolean[1001];
        Arrays.fill(visited, false);
        int pathCount = 0;
        pathCount = countPathsUtil(list, s, d, visited, pathCount); // Call the function to get the total path count
        return pathCount;
    }
}
