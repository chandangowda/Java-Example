package com.example;

public class MatrixSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixSearch= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.println(search(matrixSearch.length,matrixSearch.length,matrixSearch,17));


	}
	
	static int search(int n1, int m1, int arr1[][], int x)
    {
        int i = 0, j = m1-1;
        while(i < n1 && j >= 0)
        {
            // if element is x
            if(arr1[i][j] == x)
            {
              
                return 1;
            }
            
            // if element is greater than x
            // or smaller than x
            if(arr1[i][j] > x)
                j--;
            else i++;
        }
     
        return 0;
    }

}
