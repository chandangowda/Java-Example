package com.example;

public class ArraySortedRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] soartedRotated= {40,30,20,60,50};
		System.out.println(checkRotatedAndSorted(soartedRotated,soartedRotated.length));

	}
	
	
	 public static boolean checkRotatedAndSorted(int a[], int n){
	        
	        // Your code here
	        
	         int minInd=0,maxInd=0;
	    
	        // find index with min and max element
		    for(int i=0;i<n;i++){
		        
		        if(a[i] < a[minInd])
		            minInd = i;
		        else if(a[i] > a[maxInd])
		            maxInd = i;
		    }
		    
		    //not sorted and rotated
		    if(Math.abs(minInd - maxInd) != 1){
		     
		        return false;
		    }
		    
		    // increasing order or decreasing order
		    boolean sorted = true;
	        if(maxInd < minInd){
	    	   
	    	   // for increasing order 
	    	    for(int i=0;i<n-1;i++){
	    	        
	    	        if(a[(minInd+i)%n] > a[(minInd+i+1)%n]){
	    	         
	    	            sorted = false;
	    	            break;
	    	        }
	    	    }
	        }
		    else{
		        // for decreasing order
		        for(int i=0;i<n-1;i++){
	    	        
	    	        if(a[(minInd+n-i)%n] > a[(minInd+n-i-1)%n]){
	    	         
	    	            sorted = false;
	    	            break;
	    	        }
	    	    }
		    }

		    if(sorted) return true;
		    else return false;
	        
	    }

}
