package com.example;

public class EquilibriumPoint {

	public static void main(String[] args) {
		long[] equlibriumArray= {1,2,5,3};
		
		System.out.println(equilibrium(equlibriumArray,equlibriumArray.length));

	}
	
	public static int equilibrium(long a[], int n) {

        // Sum of all array elements
        long sum = 0;
        for (int i = 0; i < n; i++) 
           sum += a[i];

        // sum2 is used to store prefix sum
        long sum2 = 0;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            
            // Update suffix sum
            sum = sum - a[i];
            
            // Check if suffix and prefix 
            // sums are same
            if (sum2 == sum) {
                return (i + 1);
            }
            
            // Update prefix sum
            sum2 = sum2 + a[i];
        }
        return -1;
    }

}
