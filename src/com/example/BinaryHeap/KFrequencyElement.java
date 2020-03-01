package com.example.BinaryHeap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//Given an array arr[] of N integers in which elements may be repeating several times. Also, a positive number
//K is given and the task is to find sum of total frequencies of K most occurring elements
class Pair {
    int freq;
    int num;

    Pair(int x, int y) {
        this.num = x;
        this.freq = y;
    }
}

class PairComparitor implements Comparator<Pair> {
    public int compare(Pair p1, Pair p2) {
        // if frequencies of two elements are same
        // then the larger number should come first
        if (p1.freq == p2.freq) {
            if (p1.num > p2.num) return -1;
            if (p1.num < p2.num) return 1;
            return 0;
        }

        // insert elements in the priority queue on the basis of
        // decreasing order of frequencies
        if (p1.freq > p2.freq) return -1;
        if (p1.freq < p2.freq) return 1;
        return 0;
    }
}

public class KFrequencyElement {
    void kMostOccuring(int arr[], int n, int k) {
        PriorityQueue<Pair> q = new PriorityQueue<Pair>(new PairComparitor());

        // unordered_map 'um' implemented as frequency hash table
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) mp.put(arr[i], mp.get(arr[i]) + 1);
            else mp.put(arr[i], 1);
        }
        for (Map.Entry m : mp.entrySet()) {
            q.add(new Pair((int) m.getKey(), (int) m.getValue()));
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            //System.out.print(q.peek().num + " " + q.peek().freq +  "\n");
            res += q.poll().freq;
        }
        System.out.println(res);
    }

}
