package com.example;

public class BitwiseMaximunAndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,3,5,7};
        System.out.println(maxAND(a,a.length));
	}
	
	 // Utility function to check number of elements
    // having set msb as of pattern
    public static int checkBit(int pattern, int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++){
            if ((pattern & arr[i]) == pattern){
                count++;
            }
        }
        return count;
    }
    
    // Function for finding maximum and value pair
    public static int maxAND (int arr[], int n) {
        int res = 0, count;
        // iterate over total of 30bits from msb to lsb
        for (int bit = 15; bit >= 0; bit--) {
            // find the count of element having set  msb
            count = checkBit(res | (1 << bit), arr, n);
            // if count >= 2 set particular bit in result
            if( count >= 2 ){
                res |= (1 << bit);
            }
        }
        return res;
    }

}
