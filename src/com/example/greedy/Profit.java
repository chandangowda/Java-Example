package com.example.greedy;

import java.util.Arrays;
import java.util.Comparator;

class jobComparator implements Comparator<Job> {
    public int compare(Job j1, Job j2) {
        if (j1.profit > j2.profit) return -1;
        if (j1.profit < j2.profit) return 1;
        return 0;
    }
}

class Job {
    int id, profit, deadline;

    Job(int id, int profit, int deadline) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }
}

public class Profit {

    void printJobScheduling(Job arr[], int n) {
        Arrays.sort(arr, new jobComparator());
        int res = 0, count = 0;
        int[] result = new int[n];
        boolean[] slot = new boolean[n];
        Arrays.fill(slot, false);
        for (int i = 0; i < n; i++) {
            for (int j = Integer.min(n, arr[i].deadline) - 1; j >= 0; j--) {
                if (slot[j] == false) {
                    result[j] = i; // Add this job to result
                    slot[j] = true; // Make this slot occupied
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++)
            if (slot[i]) {
                count++;
                res += arr[result[i]].profit;
            }
        System.out.print(count + " " + res);
    }
}
