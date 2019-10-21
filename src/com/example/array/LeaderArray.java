package com.example.array;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderArray {
	
	public static void main(String[] args) {
		int[] leaderArray= {16,17, 4, 3, 5, 18};
		System.out.println(leadersFromCurrrentIndexToRight(leaderArray,leaderArray.length));
		
	}
	
	 static ArrayList<Integer> leadersFromCurrrentIndexToRight(int arr[], int n){
	        
	        // Your code here
	        
	        
	        /******************
	     * You just need to complete this
	     * function and return the vector
	     * containing the leaders.
	     * ***************/
	     
	       int maxEle = arr[n-1];
	        
	        ArrayList<Integer> res = new ArrayList<>();
	        
	        // traversing the array from right to left
	        for(int i=n-1; i>=0; i--) {
	            
	            // finding the leader by comparing the element
			    if(arr[i] >= maxEle){
			        maxEle = arr[i];
			        res.add(maxEle);
			    }
			}
			
			// reversing the arraylist
			Collections.reverse(res);
	        return res;
	     
	    }

}
