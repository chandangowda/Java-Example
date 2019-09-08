package com.example;

public class ArrayMaxNumberInTwo {

	public static void main(String[] args) {
		int[] L = { 1, 12, }; 
        int[] R = { 13,30, }; 
        int n = L.length; 
        System.out.println(maximumOccuredElement(L, R, n));
	}
	
	
	static int MAX = 35; 
	  
    // Return the maximum occurred element in all ranges. 
    static int maximumOccuredElement(int[] L, int[] R, int n) 
    { 
        // Initalising all element of array to 0. 
        int[] arr = new int[MAX]; 
  
        // Adding +1 at Li index and  
        // substracting 1 at Ri index. 
        for (int i = 0; i < n; i++) { 
            arr[L[i]] += 1; 
            arr[R[i] + 1] -= 1; 
        } 
  
        // Finding prefix sum and index 
        // having maximum prefix sum. 
        int msum = arr[0]; 
        int ind = 0; 
        for (int i = 1; i < MAX; i++) { 
            arr[i] += arr[i - 1]; 
            if (msum < arr[i]) { 
                msum = arr[i]; 
                ind = i; 
            } 
        } 
  
        return ind; 
    } 

}
