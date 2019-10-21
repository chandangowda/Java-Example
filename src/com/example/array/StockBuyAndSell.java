package com.example.array;

import java.util.ArrayList;

public class StockBuyAndSell {

	public static void main(String[] args) {
		int[] stockList= {180,200,180 ,100 ,260 ,310 ,40, 535 ,695};
		stockBuySell(stockList,stockList.length);

	}
	
	static void stockBuySell(int price[], int n) {
        StringBuffer str = new StringBuffer();
        
        if(n==1){
            return ;
        }
        
        ArrayList<Interval> sol = new ArrayList<Interval>();
        int i=0, cnt=0;
        while (i < n-1) {
            // Find Local Minima. Note that the limit is (n-2) as we are
            // comparing present element to the next element.
            while ((i < n-1) && (price[i+1] <= price[i])){
                i++;
            }
            // If we reached the end, break as no further solution possible
            if (i == n-1){
                break;
            }
            Interval e = new Interval();
            e.buy = i++;
 
            // Find Local Maxima.  Note that the limit is (n-1) as we are
            // comparing to previous element
            while ((i < n) && (price[i] >= price[i-1]))
                i++;
 
            // Store the index of maxima
            e.sell = i-1;
            sol.add(e);
            // Increment count of buy/sell pairs
            cnt++;
        }
        if(cnt==0){
            str.append("No Profit");
        } else {
            for(int j=0; j<sol.size(); j++){
                str.append("(" + sol.get(j).buy + " " + sol.get(j).sell +") ");
            }
        }
        System.out.print(str);
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
    	   
    	   // for decreasing order 
    	    for(int i=0;i<n-1;i++){
    	        
    	        if(a[(minInd+i)%n] > a[(minInd+i+1)%n]){
    	         
    	            sorted = false;
    	            break;
    	        }
    	    }
        }
	    else{
	        // for increasing order
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

class Interval {
    int buy;
    int sell;
}
