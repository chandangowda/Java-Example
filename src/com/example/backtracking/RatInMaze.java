package com.example.backtracking;

public class RatInMaze {

    public static void solve(int[][] a, int N) {
        int[][] sol = new int[N][N];
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                sol[i][j] = 0;
        // if no path found
        if (!solveMazeUtil(a, 0, 0, sol, N))
            System.out.println("-1");
        else // if path found
            System.out.println("Found");

    }


    public static boolean solveMazeUtil(int[][] a, int x, int y, int[][] sol, int N) {
        // if the condition matches return true here
        // also the base case for recursion
        if (x == N - 1 && y == N - 1 && a[x][y] >= 0) {
            // marking (x,y) as part of solution
            sol[x][y] = 1;
            return true;
        }


        if (isSafe(a, x, y, N)) {
            // marking (a,b) as part of solution
            sol[x][y] = 1;

            // checking for further path
            for (int i = 1; i <= a[x][y]; i++) {
                if (solveMazeUtil(a, x, y + i, sol, N))
                    return true;
                if (solveMazeUtil(a, x + i, y, sol, N))
                    return true;

            }
            // if no possible path in the direction, then mark (a,b) as not part of solution
            // doing backtracking and return false
            sol[x][y] = 0;
            return false;
        }
        // if not safe return false
        return false;
    }

    public static boolean isSafe(int[][] a, int x, int y, int N) {
        // the safe condition is when a, b is in bounds and matrix value != 0
        if (x >= 0 && x < N && y >= 0 && y < N && a[x][y] >= 1)
            return true;

        return false;
    }
}
