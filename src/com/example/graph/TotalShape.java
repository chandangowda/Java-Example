package com.example.graph;

import java.util.ArrayList;
import java.util.Scanner;

public class TotalShape {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while ((t--) > 0) {
            int n = s.nextInt(), m = s.nextInt();
            ArrayList<String> a = new ArrayList<>();
            int[][] visited = new int[n][m];
            for (int i = 0; i < n; i++) {
                a.add(s.next());
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (a.get(i).charAt(j) == 'X' && visited[i][j] != 1) {
                        myFunc(i, j, a, visited);
                        ans++;
                    }

                }
            }
            System.out.println(ans);
        }

    }

    static boolean isSafe(int i, int j, int[][] visited) {
        if (i >= 0 && i < visited.length && j >= 0 && j < visited[0].length && visited[i][j] == 0) {
            return true;
        }
        return false;
    }

    static void myFunc(int i, int j, ArrayList<String> a, int[][] visited) {
        visited[i][j] = 1;
        int[] r = {1, -1, 0, 0};
        int[] c = {0, 0, 1, -1};
        for (int p = 0; p < 4; p++) {
            if (isSafe(i + r[p], j + c[p], visited) && a.get(i + r[p]).charAt(j + c[p]) == 'X') {
                myFunc(i + r[p], j + c[p], a, visited);
            }
        }
    }
}
