package com.example;

import java.util.Arrays;

//Given a boolean matrix mat[r][c] of size r X c,
//modify it such that if a matrix cell mat[i][j] is 1 (or true) then make all the cells of ith row and jth column as 1.
/*1 0 0       1 1 1      
  1 0 0       1 1 1
  1 0 0------>1 1 1
  0 0 0       1 0 0*/
public class MatrixBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] booleanMatrix= {{1,0,0},{1,0,0},{1,0,0},{0,0,0}};
		booleanMatrix(booleanMatrix.length,booleanMatrix.length,booleanMatrix);

	}
	
	static void booleanMatrix(int r, int c, int mat[][])
    {
        // using auxiliary array to store occurence of 1 in rows and columns
        int ar[] = new int[r];
        int ac[] = new int[c];
        
        Arrays.fill(ar, 0);
        Arrays.fill(ac, 0);
        
        // traversing through the matrix
        for(int i = 0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    //if a 1 is encountered in the matrix then
                    if(mat[i][j] == 1)
                    {
                        //our temp arrays for row and columns are set to 1
                        ar[i] = 1;
                        ac[j] = 1;
                    }
                      
                }
            }
            
            StringBuilder sb = new StringBuilder();
            
            // again traversing the matrix to make the rows and columns
            // where cell contains 1
            for(int i =0; i < r; i++)
            {
                for(int j = 0; j < c; j++)
                {
                    // if either row array or col array contains 1
                    if(ar[i] == 1 || ac[j] == 1)
                    {
                        
                        // mark the matrix cell as 1
                        mat[i][j] = 1;
                    }
                    sb.append(mat[i][j] + " ");  
                }
                sb.append("\n"); 
            }
            System.out.print(sb);
    }

}
