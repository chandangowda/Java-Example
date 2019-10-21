package com.example.matrix;

public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrixtrans= {{6,5,4},{1,2,3},{1,2,3}};
        transpose(matrixtrans,matrixtrans.length);

	}
	
	static void transpose(int a[][], int n)
    {
        // traversing matrix and swapping the elements
        // of different cells
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
            }
        }
    }

}
