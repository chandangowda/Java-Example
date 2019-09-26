package com.example;

public class SerachBinaryCountOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] onesArray= {1,1,1,1,0,0};
		System.out.println(countOnes(onesArray.length,onesArray));

	}
	
	  public static int countOnes(int n,int[] arrayInput){
	        
	        int low = 0, high = n-1;
	        
	        int mid = (low+high)/2;
	        
	        // Binary Search
	        while(low <= high){
	            
	            mid = (low + high)/2;
	            
	            // if mid is 1, then check for upper half
	            if(arrayInput[mid] == 1 && mid+1 < n && arrayInput[mid+1] == 1){
	                low = mid+1;
	            }
	            
	            // if mid is 0, then iterate for upper half
	            else if(arrayInput[mid] == 0){
	                high = mid-1;
	            }
	            
	            // else, iterate for lower half
	            else if(arrayInput[mid] == 1 && ((mid+1 < n && arrayInput[mid+1] == 0) || (mid == n-1))){
	                return mid+1;
	            }
	            
	        }
	        return 0;
	    }

}
