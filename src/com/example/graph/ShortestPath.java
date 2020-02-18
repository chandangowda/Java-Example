package com.example.graph;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ShortestPath {



    public int[] shortPath(List<List<Integer>> graphData,int source,boolean[] visited){
        int[] distance=new int[graphData.size()];
        Queue<Integer> queueData=new LinkedList<>();
        queueData.add(source);
        distance[source]=0;
        visited[source]=true;
        while (!queueData.isEmpty()){
            int data=queueData.poll();
            visited[data]=true;
            for(int child:graphData.get(data)){
                if(!visited[child]){
                    distance[child]=distance[data]+1;
                    visited[child]=true;
                    queueData.add(child);
                }
            }
        }

        return distance;
    }
}
