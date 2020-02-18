package com.example.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StronglyConnectedGraph {

    private int V;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency List

    //Constructor
    StronglyConnectedGraph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    public void DFS(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited, List<Integer> comp) {
        visited[v] = true;
        for (int i = 0; i < graph.get(v).size(); i++)

            if (!visited[graph.get(v).get(i)])
                DFS(graph, graph.get(v).get(i), visited, comp);

        comp.add(v);
    }

    public List<Integer> fillOrder(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int N) {

        List<Integer> order = new ArrayList<Integer>();
        for (int i = 0; i < N; i++)

            if (!visited[i]) DFS(graph, i, visited, order);

        return order;
    }

    public ArrayList<ArrayList<Integer>> getTranspose(ArrayList<ArrayList<Integer>> graph, int N) {

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();
        for (int i = 0; i < N; i++)
            g.add(i, new ArrayList<Integer>());
        for (int v = 0; v < N; v++)
            for (int i = 0; i < graph.get(v).size(); i++)
                g.get(graph.get(v).get(i)).add(v);

        return g;
    }

    int kosaraju(ArrayList<ArrayList<Integer>> list, int N) {
        boolean[] visited = new boolean[N];
        List<Integer> order = fillOrder(list, visited, N);
        ArrayList<ArrayList<Integer>> reverseGraph = getTranspose(list, N);
        visited = new boolean[N];
        Collections.reverse(order);
        List<List<Integer>> SCComp = new ArrayList<>();
        for (int i = 0; i < order.size(); i++) {
            int v = order.get(i);
            if (!visited[v]) {
                List<Integer> comp = new ArrayList<>();
                DFS(reverseGraph, v, visited, comp);
                SCComp.add(comp);
            }
        }

        return SCComp.size() - 1;
    }
}
