package com.example.matrix;

import java.util.Arrays;

public class MatrixBeautiful {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrixBeautiful= {{1,2,3},{4,2,3},{3,2,1}};
		System.out.println(findMinOperation(matrixBeautiful.length,matrixBeautiful));

	}
	
	 static int findMinOperation(int n, int mat[][])
	    {
	        // Initialize the sumRow[] 
	        // and sumCol[] array to 0 
	        int sumRow[] = new int[n];
	        int sumCol[] = new int[n];
	        Arrays.fill(sumRow, 0);
	        Arrays.fill(sumCol, 0);
	        
	        // Calculate sumRow[] and 
	        // sumCol[] array 
	        for(int i = 0; i < n; i++)
	        {
	            for(int j = 0; j < n; j++)
	                {
	                    sumRow[i] += mat[i][j];
	                    sumCol[j] += mat[i][j];
	                      
	                }
	        }
	        
	        // Find maximum sum value  
	        // in either row or in column 
	        int maxSum = 0;
	        for (int i = 0; i < n; ++i)
	        {
	        	maxSum = Math.max(maxSum, sumRow[i]);
	        	maxSum = Math.max(maxSum, sumCol[i]);
	        } 
	        int count = 0;
	            for (int i = 0, j = 0; i < n && j < n;) 
	        	{
	        	    // Find minimum increment 
	                // required in either row 
	                // or column 
	        		int diff = Math.min(maxSum - sumRow[i],	maxSum - sumCol[j]);
	        		
	        		// Add difference in  
	                // corresponding cell, 
	                // sumRow[] and sumCol[] 
	                // array 
	        		mat[i][j] += diff;
	        		sumRow[i] += diff;
	        		sumCol[j] += diff;
	        		
	        		// Update the count  
	                // variable
	        		count += diff;
	        		
	        		// If ith row satisfied, 
	                // increment ith value  
	                // for next iteration 
	        		if (sumRow[i] == maxSum)++i;
	        		if (sumCol[j] == maxSum)++j;
	        	}
		return count;
	    }

}
