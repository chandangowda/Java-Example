package com.example;

public class MatrixBoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] boundaryTraversal= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		boundaryTraversal(boundaryTraversal.length,boundaryTraversal.length,boundaryTraversal);

	}
	
	static void boundaryTraversal( int row, int column, int arr1[][])
    {
        // base cases
        if(row == 1)
        {
            int i = 0;
            while(i < column)
            System.out.print(arr1[0][i++] + " ");
        }
        else if(column == 1)
        {
            int i = 0;
            while(i < row)
            System.out.print(arr1[i++][0]+" ");
        }
        else
        {
            
            // traversing the first row
            for(int j=0;j<column;j++)
            {
                System.out.print(arr1[0][j]+" ");
            }
            
            // traversing the last column
            for(int j=1;j<row;j++)
            {
                System.out.print(arr1[j][column-1]+ " ");
            }
            
            // traversing the last row
            for(int j=column-2;j>=0;j--)
            {
                System.out.print(arr1[row-1][j]+" ");
            }
            
            // traversing the first column
            for(int j=row-2;j>=1;j--)
            {
               System.out.print(arr1[j][0]+" ");
            }
            
        } 
            
    }

}
