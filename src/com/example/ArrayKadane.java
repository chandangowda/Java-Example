package com.example;

public class ArrayKadane {

	public static void main(String[] args) {
		int[] arr= {2,3,-3,6,4,11,-4,10,10,-31};
		 int maxh = 0, maxf = Integer.MIN_VALUE;
		    for(int i=0; i<arr.length; i++){
		        maxh+=arr[i];
		        maxf=Integer.max(maxh,maxf);
		        if(maxh<0)
		            maxh=0;

	        }
		 System.out.println(maxf);   

	}

}
