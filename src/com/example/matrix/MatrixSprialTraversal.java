package com.example.matrix;

public class MatrixSprialTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrixsprialTraversal= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spirallyTraverse(matrixsprialTraversal.length,matrixsprialTraversal.length,matrixsprialTraversal);
	}
	
	 static void spirallyTraverse(int m, int n, int arr1[][])
	    {
	        int i =0,  row = 0, col = 0;
	        while(row<m && col < n)
	        {
	            
	            // printing first row
	            for(i = col; i < n; i++)
	                System.out.print(arr1[row][i] + " ");
	            row++;
	            
	            // printing last column
	            for(i = row; i < m; i++)
	                System.out.print(arr1[i][n-1] + " ");
	            n--;
	            
	            if(row < m)
	            {
	                
	                // printing last row
	                for(i = n-1; i >= col; --i)
	                    System.out.print(arr1[m-1][i] + " ");
	                m--;
	            }
	            if(col < n)
	            {
	                // first column
	                for(i = m-1; i >= row; --i)
	                    System.out.print(arr1[i][col] + " ");
	                col++;
	            }
	        }
	        
	    }

}
