package com.example.binary;

public class BinaryLeftIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] leftIndexArray= {0,0,1,1,1,2,2,3};
	System.out.println(leftIndex(leftIndexArray.length,leftIndexArray,2));

	}
	
	static int leftIndex(int sizeOfArray, int arr[], int elementToSearch)
    {
       int lo = 0, hi = sizeOfArray-1, mid = lo + ((hi-lo)/2);
    
        // looping through array using binary search
        while(lo <= hi){
        // calculate mid
         mid = lo + ((hi-lo)/2);
    
        // if element is equal to arr[mid]
        // element is found, return true
        if(arr[mid] == elementToSearch && (mid== 0 || arr[mid-1] < elementToSearch)){
            return mid;
        }
        
        // if elemntToSearch > middle of current array,
        // go for higher part of array
        if(elementToSearch > arr[mid]){
            lo = mid+1;
        }
        else
        // if elemntToSearch < middle of current array,
        // go for lower part of array
            hi = mid-1;
        
    }
    
        // if element is not there in the array, return false
        return -1;
    }

}
