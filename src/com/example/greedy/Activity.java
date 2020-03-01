package com.example.greedy;

import java.util.Arrays;
import java.util.Comparator;

/*Given N activities with their start and finish times. Select the maximum number of activities that
can be performed by a single person, assuming that a person can only work on a single activity at a time.*/
class Pair {
    int x, y;

    Pair() {
        this.x = 0;
        this.y = 0;
    }

    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Activity {

    static void sortPair(Pair arr[], int n) {
        Arrays.sort(arr, new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                return p1.x - p2.x;
            }
        });
    }

    static int activitySelection(int start[], int end[], int n) {
        Pair[] p = new Pair[n];
        for (int i = 0; i < n; i++) {
            p[i] = new Pair();
            p[i].y = start[i];
        }
        for (int i = 0; i < n; i++) {
            p[i].x = end[i];
        }
        sortPair(p, n);
        int i = 0, j = 1, ans = 1;
        while (i < n && j < n) {
            if (p[i].x <= p[j].y) {
                i = j;
                j++;
                ans++;
            } else {
                j++;
            }
        }
        return ans;
    }
}
