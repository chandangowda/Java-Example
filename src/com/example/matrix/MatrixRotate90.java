package com.example.matrix;

public class MatrixRotate90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrixrotate= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotateby90(matrixrotate,matrixrotate.length);
	}

	// After transpose we swap elements of
	// column one by one for finding left
	// rotation of matrix by 90 degree
	static void reverseColumns(int arr[][]) {
		for (int i = 0; i < arr[0].length; i++)
			for (int j = 0, k = arr[0].length - 1; j < k; j++, k--) {
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
			}
	}

	// Function for do transpose of matrix
	static void transpose(int arr[][]) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
			}
	}

	// Function to anticlockwise rotate
	// matrix by 90 degree
	static void rotateby90(int arr[][], int n) {
		transpose(arr);
		reverseColumns(arr);
	}

	void rotateMatrix(int mat[][]) {
		int N = mat.length;
		// Consider all squares one by one
		for (int i = 0; i < mat.length / 2; i++) {
			// Consider elements in group of 4 in
			// current square
			for (int j = i; j < mat.length - i - 1; j++) {
				// store current cell in temp variable
				int temp = mat[i][j];

				// move values from right to top
				mat[i][j] = mat[j][N - 1 - i];

				// move values from bottom to right
				mat[j][N - 1 - i] = mat[N - 1 - i][N - 1 - j];

				// move values from left to bottom
				mat[N - 1 - i][N - 1 - j] = mat[N - 1 - j][i];

				// assign temp to left
				mat[N - 1 - j][i] = temp;
			}
		}

	}

}
