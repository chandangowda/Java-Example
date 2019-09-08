package com.example;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixmul1= {{6,5,4},{1,2,3},{1,2,3}};
		int[][] matrixmul2= {{6,5,4},{1,2,3},{1,2,3}};
		multiplyMatrix(matrixmul1.length,matrixmul1[0].length,
				matrixmul2.length,matrixmul2[0].length,matrixmul1,matrixmul2);

	}
	
	static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][])
    {
        // if size of matrix are not same
        if(m1 != n2)
            System.out.print("-1");
            
        // if size of matrix are not same
        else
        {
            int mul_matrix[][] = new int[n1][m2];
            
            // traversing the matrix and finding sum of corressponding elements
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m2; j++)
                {
                    int mul = 0;
                    for(int k = 0; k < m1; k++)
                        mul += arr1[i][k]*arr2[k][j];
                    mul_matrix[i][j] = mul;
                }
            }
            
            for(int i = 0; i < n1; i++)
            {
                for(int j = 0; j < m2; j++)
                    System.out.print(mul_matrix[i][j] + " ");
            }
        }
    }

}
