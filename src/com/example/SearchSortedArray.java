package com.example;

public class SearchSortedArray {

	public static void main(String[] args) {
		int[] searchArray= {1,2,3,4,5};
		System.out.println(searchInSorted(searchArray,searchArray.length,4));

	}
	
	 static int searchInSorted(int arr[], int n, int x)
	    {
	        int l = 0, r = n-1;
	        int m = l + (r-l) / 2;
	    
	        while (l <= r) 
	        { 
	    	     m = l + (r - l) / 2; 
	    
	    	    // Check if x is present at mid 
	    	    if (arr[m] == x) 
	    		    return 1; 
	    
	    	    // If x greater, ignore left half 
	    	    if (arr[m] < x) 
	    		    l = m + 1; 
	    
	    	    // If x is smaller, ignore right half 
	    	    else
	    		    r = m - 1; 
	        } 
	    
	            // if we reach here, then element was 
	            // not present 
	            return -1; 
	    }

}
