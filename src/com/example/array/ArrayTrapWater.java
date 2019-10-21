package com.example.array;

public class ArrayTrapWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] trapWater= {0 ,0,0,0 ,0,3};
         System.out.println(trappingWater(trapWater,trapWater.length));
	}
	
	 static int trappingWater(int arr[], int n) { 
	        int leftMax = 0, rightMax = 0, res = 0;
	        int low = 0, high = n-1;
	        while(low <= high){
	            
	            // update the max on left
	            if(arr[low] < arr[high]){
	                if(arr[low] > leftMax){
	                    leftMax = arr[low];
	                } else {
	                    res += leftMax-arr[low];
	                }
	                low++;
	            } 
	            
	            // else, update the max on right
	            else {
	                if(arr[high] > rightMax){
	                    rightMax = arr[high];
	                } else {
	                    res += rightMax-arr[high];
	                }
	                high--;
	            }
	        }
	        return res;
	    } 

}
