package com.example;

public class ArrayFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] frequecyarray= {1,2,3,2,3,5};
		printFrequency(frequecyarray,frequecyarray.length);

	}
	
	public static void  printFrequency(int arr[], int n){
        
        StringBuffer str = new StringBuffer();
      
      // decrementing the values of array elements by 1
      // just for the sake of simplicity
      for(int i=0; i<n; i++){
          arr[i] = arr[i]-1;
      }
      
      // changing the array elements by using mathematical formulae
      for(int i=0; i<n; i++){
          arr[arr[i]%n] = arr[arr[i]%n]+n;
      }
      
      for(int i=0; i<n; i++){
          str.append(arr[i]/n+" ");
      }
      System.out.print(str);
      
  }

}
