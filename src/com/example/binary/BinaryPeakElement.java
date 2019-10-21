package com.example.binary;
//An array element is peak if it is not smaller than its neighbours
public class BinaryPeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] peekElementArray= {1,2,3,4};
		System.out.println(peakElement(peekElementArray,peekElementArray.length));

	}
	
	public static int   peakElement(int[] a,int n){
		return peakElementUtil(a,0,n-1,n);
	}
	
	// recursive binary search to find the peak element
	public static int peakElementUtil(int[] arr,int low,int high,int n){
		int mid=(low+high)>>1;
		
	
		if ((mid == 0 || arr[mid-1] <= arr[mid]) &&(mid == n-1 || arr[mid+1] <= arr[mid]))
			return mid;
		
		// If mid is other than 0, then check if mid element is less than prev.
        // If so, then recurse for lower half
		else if(mid>0&&arr[mid-1]>arr[mid])
			return peakElementUtil(arr,low,mid-1,n);
			
		// else recurse for the upper half
		else
			return peakElementUtil(arr,mid+1,high,n);
	}

}
