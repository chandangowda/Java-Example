package com.example;

public class Matrix_Upper_Lower_TriangleSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrixsum= {{6,5,4},{1,2,3},{1,2,3}};
		Summatrix(matrixsum,matrixsum.length);

	}
	
	 static void Summatrix(int mat[][], int n)
	    {
	        int i = 0, j = 0, us = 0, ls= 0; 
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<n;j++)
	            {
	                if(i==j)
	                {
	                    us+=mat[i][j]; // summing the diagonal
	                    ls+=mat[i][j]; //summing the diagonal
	                    //The diagonal will be common to both upper sums and lower sums
	                }
	                else if(j>i) 
	                    us+=mat[i][j]; //sum gets added to upper sum
	                else if(j<i)
	                    ls+=mat[i][j]; //sum gets added to lower sum
	            }   
	        }
	        System.out.print(us+ " "+ls); //print sum of upper triangle and lower triangle
	    }

}
