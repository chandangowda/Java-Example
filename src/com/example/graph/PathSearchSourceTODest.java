package com.example.graph;

import java.util.LinkedList;
import java.util.Queue;

public class PathSearchSourceTODest {

    static class Pair {
        int x, y;

        Pair(int a, int b) {
            this.x = a;
            this.y = b;
        }
    }

    // method for finding and printing
    // whether the path exists or not
    public static void isPath(int matrix[][], int n) {
        // defining visited array to keep
        // track of already visited indexes
        boolean visited[][] = new boolean[n][n];

        // flag to indicate whether the path exists or not
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // if matrix[i][j] is source
                // and it is not visited
                if (matrix[i][j] == 1 && !visited[i][j])

                    // starting from i, j and then finding the path
                    if (isPath(matrix, i, j, visited)) {
                        flag = true; // if path exists
                        break;
                    }
            }
        }
        if (flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }


    // method for checking boundries
    public static boolean isSafe(int i, int j, int matrix[][]) {

        if (i >= 0 && i < matrix.length && j >= 0
                && j < matrix[0].length)
            return true;
        return false;
    }

    // Returns true if there is a path from a source (a
    // cell with value 1) to a destination (a cell with
    // value 2)
    public static boolean isPath(int matrix[][],
                                 int i, int j, boolean visited[][]) {

        // checking the boundries, walls and
        // whether the cell is unvisited
        if (isSafe(i, j, matrix) && matrix[i][j] != 0
                && !visited[i][j]) {
            // make the cell visited
            visited[i][j] = true;

            // if the cell is the required
            // destination then return true
            if (matrix[i][j] == 2)
                return true;

            // traverse up
            boolean up = isPath(matrix, i - 1, j, visited);

            // if path is found in up direction return true
            if (up)
                return true;

            // traverse left
            boolean left = isPath(matrix, i, j - 1, visited);

            // if path is found in left direction return true
            if (left)
                return true;

            //traverse down
            boolean down = isPath(matrix, i + 1, j, visited);

            // if path is found in down direction return true
            if (down)
                return true;

            // traverse right
            boolean right = isPath(matrix, i, j + 1, visited);

            // if path is found in right direction return true
            if (right)
                return true;
        }
        return false; // no path has been found
    }

    // driver program to check above function

    public static void main(String[] args) {

        int matrix[][] = {{0, 3, 0, 1},
                {3, 0, 3, 3},
                {2, 3, 3, 3},
                {0, 3, 3, 3}};

        isPath(matrix, 4);                 // calling isPath method
    }

    static int[] X = new int[]{1, 0, -1, 0};
    static int[] Y = new int[]{0, 1, 0, -1};

    static boolean validPath(int x, int y, int n) {
        return (x >= 0 && y >= 0 && x < n && y < n);
    }

    static int pathExists(int[][] arr, int n, Pair s, Pair d) {
        boolean[][] visited = new boolean[n + 1][n + 1];
        Queue<Pair> q = new LinkedList<>();
        q.add(s);
        boolean pathFound = false;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            visited[p.x][p.y] = true;
            for (int i = 0; i < 4; i++) {
                int x = p.x + X[i];
                int y = p.y + Y[i];
                if (validPath(x, y, n)) {
                    if (arr[x][y] == 2) {
                        pathFound = true;
                        break;
                    }
                    if (!visited[x][y] && arr[x][y] == 3) {
                        q.add(new Pair(x, y));
                    }
                }
            }
            if (pathFound) break;
        }
        if (pathFound) return 1;
        return 0;
    }
}
