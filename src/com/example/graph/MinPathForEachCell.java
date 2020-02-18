package com.example.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*Given a binary matrix of size N x M. The task is to find the distance of nearest
1 in the matrix for each cell. The distance is calculated as |i1 – i2| + |j1 – j2|, where i1,
j1 are the row number and column number of the current cell and i2,
j2 are the row number and column number of the nearest cell having value 1.*/


class Pair {
    int first, second;

    Pair(int x, int y) {
        this.first = x;
        this.second = y;
    }
}


public class MinPathForEachCell {

    static int N = 3;
    static int M = 4;

    // Print the distance of nearest cell
    // having 1 for each cell.
    static void printDistance(int mat[][]) {
        int ans[][] = new int[N][M];

        // Initialize the answer matrix with INT_MAX.
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++)
                ans[i][j] = Integer.MAX_VALUE;

        // For each cell
        for (int i = 0; i < N; i++)
            for (int j = 0; j < M; j++) {
                // Traversing the whole matrix
                // to find the minimum distance.
                for (int k = 0; k < N; k++)
                    for (int l = 0; l < M; l++) {
                        // If cell contain 1, check
                        // for minimum distance.
                        if (mat[k][l] == 1)
                            ans[i][j] =
                                    Math.min(ans[i][j],
                                            Math.abs(i - k)
                                                    + Math.abs(j - l));
                    }
            }

        // Printing the answer.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++)
                System.out.print(ans[i][j] + " ");

            System.out.println();
        }
    }

    // Driven Program
    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1},
                {0, 0, 1, 1},
                {1, 1, 1, 0}};

        printDistance(mat);
    }

    static void nearest(ArrayList<ArrayList<Integer>> list, int row, int col) {
        int newx[] = {-1, 0, 1, 0};
        int newy[] = {0, -1, 0, 1};

        int dist[][] = new int[row][col];

        // queue of pairs to store nodes for bfs
        Queue<Pair> q = new LinkedList<>();

        // traverse matrix and make pair of indices of
        // cell (i,j) having value '1' and push them
        // in queue
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                dist[i][j] = Integer.MAX_VALUE;

                if (list.get(i).get(j) == 1) {
                    // distace of '1' from itself is always 0
                    dist[i][j] = 0;

                    // make pair and push it in queue
                    q.add(new Pair(i, j));
                }
            }
        }

        // now do bfs traversal
        // pop element from queue one by one untill it gets empty
        // pair element to hold the currently poped element
        Pair poped;
        while (!q.isEmpty()) {
            poped = q.peek();
            q.poll();

            // coordinate of currently poped node
            int x = poped.first;
            int y = poped.second;

            // now check for all adjancent of poped element
            for (int i = 0; i < 4; i++) {
                int adjx = x + newx[i];
                int adjy = y + newy[i];

                // if new coordinates are within boundary and
                // we can minimize the distance of adjancent
                // then update the distnace of adjacent in
                // distance matrix and push this adjacent
                // element in queue for further bfs
                if (adjx >= 0 && adjx < row && adjy >= 0 && adjy < col &&
                        dist[adjx][adjy] > dist[x][y] + 1) {
                    // update distance
                    dist[adjx][adjy] = dist[x][y] + 1;
                    q.add(new Pair(adjx, adjy));
                }
            }
        }


        ArrayList<ArrayList<Integer>> sol = new ArrayList<>(row);

        for (int i = 0; i < row; i++) {
            ArrayList<Integer> temp = new ArrayList<>(col);
            sol.add(i, temp);
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sol.get(i).add(j, dist[i][j]);
            }
        }


    }
}
