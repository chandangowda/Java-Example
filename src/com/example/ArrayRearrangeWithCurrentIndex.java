package com.example;

import java.util.Arrays;

public class ArrayRearrangeWithCurrentIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] rearrange= {4 ,0 ,2 ,1 ,3};
		arrange(rearrange,rearrange.length);
		Arrays.stream(rearrange).forEach(elelemnt->System.out.print(elelemnt+" "));

		
	}
	
	
	static void arrange(long arr[], int n)
    {
       
        int i = 0;
        
        // changing the array elements
        for(i = 0; i < n; i++)
         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;
        
        // this step will rearrange the elements finally
        for(i = 0; i < n; i++)
            arr[(int)i] = arr[(int)i]/n;
    
    }

}
