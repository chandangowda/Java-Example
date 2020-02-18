package com.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MotherVertex {

    static int findMother(ArrayList<ArrayList<Integer>> list, int n) {
        boolean visited[] = new boolean[n + 1];
        Arrays.fill(visited, false);
        int v = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfsUtil(list, i, visited);
                v = i;
            }
        }
        Arrays.fill(visited, false);
        dfsUtil(list, v, visited);
        for (int i = 0; i < n; i++) {
            if (!visited[i])
                return -1;
        }

        return v;
    }

    static void dfsUtil(ArrayList<ArrayList<Integer>> list, int v, boolean[] visited) {
        visited[v] = true;
        Iterator<Integer> it = list.get(v).listIterator();
        while (it.hasNext()) {
            int tmp = it.next();
            if (!visited[tmp]) {
                dfsUtil(list, tmp, visited);
            }
        }
    }
}
