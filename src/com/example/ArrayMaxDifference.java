package com.example;

public class ArrayMaxDifference {

	public static void main(String[] args) {
		int [] differenceArray= {34, 8 ,10 ,3 ,2, 80 ,30 ,33 ,1};
		System.out.println(maxIndexDiff(differenceArray,differenceArray.length));
	}
	
	 /**
	 * @param arr
	 * @param n
	 * @return
	 */
	static int maxIndexDiff(int arr[], int n) { 
	        if(n==1){
	            return 0;
	        }
	        int RMax[] = new int[n]; 
	        int LMin[] = new int[n]; 
	        
	        /* Construct LMin[] such that LMin[i] stores the minimum value j
	            from (arr[0], arr[1], ... arr[i]) */
	        LMin[0] = arr[0];
	        for (int i = 1; i < n; ++i) 
	            LMin[i] = Integer.min(arr[i], LMin[i - 1]);
	            
	        /* Construct RMax[] such that RMax[j] stores the maximum value 
	            from (arr[j], arr[j+1], ..arr[n-1]) */
	        RMax[n - 1] = arr[n - 1]; 
	        for (int j = n - 2; j >= 0; --j)
	            RMax[j] = Integer.max(arr[j], RMax[j + 1]); 
	            
	        /* Traverse both arrays from left to right to find optimum j - i 
	            This process is similar to merge() of MergeSort */
	        int i = 0, j = 0, maxDiff = -1; 
	        while (j < n && i < n) { 
	            if (LMin[i] <= RMax[j]) { 
	                maxDiff = Integer.max(maxDiff, j - i); 
	                j++; 
	            } else
	                i++;
	        }
	        return maxDiff; 
	    }

}
