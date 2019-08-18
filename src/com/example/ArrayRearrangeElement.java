package com.example;

import java.util.Arrays;

public class ArrayRearrangeElement {

	public static void main(String[] args) {
		int[] rearrange= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
		rearrangeData(rearrange, rearrange.length);
		Arrays.stream(rearrange).forEach(elelemnt->System.out.print(elelemnt+" "));
	

	}
	
	
//	Here, We will use the formula Dividend = Divisor * Quotient + Remainder
//			where Divisor = max_element
//			           Quotient = New number at index i after rearrangement
//			           Remainder = Old Number at index i before rearrangement
//			           Dividend = The number stored at index i
	 public static void rearrangeData(int arr[], int n)
	    {
	        // initialize index of first minimum and first 
	    	// maximum element 
	    	int max_idx = n - 1, min_idx = 0; 
	    
	    	// store maximum element of array 
	    	int max_elem = arr[n - 1] + 1; 
	    
	    	// traverse array elements 
	    	for (int i = 0; i < n; i++) { 
	    		// at even index : we have to put maximum element 
	    		if (i % 2 == 0) { 
	    			arr[i] += (arr[max_idx] % max_elem) * max_elem; 
	    			max_idx--; 
	    		} 
	    
	    		// at odd index : we have to put minimum element 
	    		else { 
	    			arr[i] += (arr[min_idx] % max_elem) * max_elem; 
	    			min_idx++; 
	    		} 
	    	} 
	    
	    	// array elements back to it's original form 
	    	for (int i = 0; i < n; i++) 
	    		arr[i] = arr[i] / max_elem;
	        
	    }

}
