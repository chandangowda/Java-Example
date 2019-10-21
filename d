[1mdiff --git a/src/com/example/ArrayFrequency.java b/src/com/example/ArrayFrequency.java[m
[1mdeleted file mode 100644[m
[1mindex 043437b..0000000[m
[1m--- a/src/com/example/ArrayFrequency.java[m
[1m+++ /dev/null[m
[36m@@ -1,34 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayFrequency {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-		int[] frequecyarray= {1,2,3,2,3,5};[m
[31m-		printFrequency(frequecyarray,frequecyarray.length);[m
[31m-[m
[31m-	}[m
[31m-	[m
[31m-	public static void  printFrequency(int arr[], int n){[m
[31m-        [m
[31m-        StringBuffer str = new StringBuffer();[m
[31m-      [m
[31m-      // decrementing the values of array elements by 1[m
[31m-      // just for the sake of simplicity[m
[31m-      for(int i=0; i<n; i++){[m
[31m-          arr[i] = arr[i]-1;[m
[31m-      }[m
[31m-      [m
[31m-      // changing the array elements by using mathematical formulae[m
[31m-      for(int i=0; i<n; i++){[m
[31m-          arr[arr[i]%n] = arr[arr[i]%n]+n;[m
[31m-      }[m
[31m-      [m
[31m-      for(int i=0; i<n; i++){[m
[31m-          str.append(arr[i]/n+" ");[m
[31m-      }[m
[31m-      System.out.print(str);[m
[31m-      [m
[31m-  }[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayKadane.java b/src/com/example/ArrayKadane.java[m
[1mdeleted file mode 100644[m
[1mindex 2e4cfd0..0000000[m
[1m--- a/src/com/example/ArrayKadane.java[m
[1m+++ /dev/null[m
[36m@@ -1,19 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayKadane {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		int[] arr= {2,3,-3,6,4,11,-4,10,10,-31};[m
[31m-		 int maxh = 0, maxf = Integer.MIN_VALUE;[m
[31m-		    for(int i=0; i<arr.length; i++){[m
[31m-		        maxh+=arr[i];[m
[31m-		        maxf=Integer.max(maxh,maxf);[m
[31m-		        if(maxh<0)[m
[31m-		            maxh=0;[m
[31m-[m
[31m-	        }[m
[31m-		 System.out.println(maxf);   [m
[31m-[m
[31m-	}[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayKadaneSubArray.java b/src/com/example/ArrayKadaneSubArray.java[m
[1mdeleted file mode 100644[m
[1mindex ddae569..0000000[m
[1m--- a/src/com/example/ArrayKadaneSubArray.java[m
[1m+++ /dev/null[m
[36m@@ -1,65 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayKadaneSubArray {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		int[] arr= {1,-3,-4,3,9};[m
[31m-        System.out.println(circularSubarraySum(arr, arr.length));[m
[31m-	}[m
[31m-	[m
[31m-	   // finding the subarray with max sum[m
[31m-    static int  circularSubarraySum(int a[], int n) [m
[31m-    { [m
[31m-        //int n = a.length; [m
[31m-         //boolean flag  = false;[m
[31m-        int count =0;[m
[31m-        int maxx = Integer.MIN_VALUE;[m
[31m-        for(int i = 0; i < n; i++)[m
[31m-        {[m
[31m-            if(a[i] > maxx)[m
[31m-              maxx = a[i];[m
[31m-            if(a[i] < 0)[m
[31m-              count++;[m
[31m-        }[m
[31m-        if(count == n)[m
[31m-          return maxx;[m
[31m-  [m
[31m-        // Case 1: get the maximum sum using standard kadane' [m
[31m-        // s algorithm [m
[31m-        int max_kadane = kadane(a); [m
[31m-  [m
[31m-        // Case 2: Now find the maximum sum that includes [m
[31m-        // corner elements. [m
[31m-        int max_wrap  =  0; [m
[31m-        for (int i = 0; i < n; i++) [m
[31m-        { [m
[31m-            max_wrap += a[i]; // Calculate array-sum [m
[31m-            a[i] = -a[i];  // invert the array (change sign) [m
[31m-        } [m
[31m-  [m
[31m-        // max sum with corner elements will be: [m
[31m-        // array-sum - (-max subarray sum of inverted array) [m
[31m-        max_wrap = max_wrap + kadane(a); [m
[31m-  [m
[31m-        // The maximum circular sum will be maximum of two sums [m
[31m-        return (max_wrap > max_kadane)? max_wrap: max_kadane; [m
[31m-    } [m
[31m-  [m
[31m-    // Standard Kadane's algorithm to find maximum subarray sum [m
[31m-    // See https://www.geeksforgeeks.org/archives/576 for details [m
[31m-    static int kadane (int a[]) [m
[31m-    { [m
[31m-        int n = a.length; [m
[31m-        int max_so_far = 0, max_ending_here = 0; [m
[31m-        for (int i = 0; i < n; i++) [m
[31m-        { [m
[31m-            max_ending_here = max_ending_here + a[i]; [m
[31m-            if (max_ending_here < 0) [m
[31m-                max_ending_here = 0; [m
[31m-            if (max_so_far < max_ending_here) [m
[31m-                max_so_far = max_ending_here; [m
[31m-        } [m
[31m-        return max_so_far; [m
[31m-    }  [m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayMaxDifference.java b/src/com/example/ArrayMaxDifference.java[m
[1mdeleted file mode 100644[m
[1mindex 99f1d2a..0000000[m
[1m--- a/src/com/example/ArrayMaxDifference.java[m
[1m+++ /dev/null[m
[36m@@ -1,47 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayMaxDifference {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		int [] differenceArray= {34, 8 ,10 ,3 ,2, 80 ,30 ,33 ,1};[m
[31m-		System.out.println(maxIndexDiff(differenceArray,differenceArray.length));[m
[31m-	}[m
[31m-	[m
[31m-	 /**[m
[31m-	 * @param arr[m
[31m-	 * @param n[m
[31m-	 * @return[m
[31m-	 */[m
[31m-	static int maxIndexDiff(int arr[], int n) { [m
[31m-	        if(n==1){[m
[31m-	            return 0;[m
[31m-	        }[m
[31m-	        int RMax[] = new int[n]; [m
[31m-	        int LMin[] = new int[n]; [m
[31m-	        [m
[31m-	        /* Construct LMin[] such that LMin[i] stores the minimum value j[m
[31m-	            from (arr[0], arr[1], ... arr[i]) */[m
[31m-	        LMin[0] = arr[0];[m
[31m-	        for (int i = 1; i < n; ++i) [m
[31m-	            LMin[i] = Integer.min(arr[i], LMin[i - 1]);[m
[31m-	            [m
[31m-	        /* Construct RMax[] such that RMax[j] stores the maximum value [m
[31m-	            from (arr[j], arr[j+1], ..arr[n-1]) */[m
[31m-	        RMax[n - 1] = arr[n - 1]; [m
[31m-	        for (int j = n - 2; j >= 0; --j)[m
[31m-	            RMax[j] = Integer.max(arr[j], RMax[j + 1]); [m
[31m-	            [m
[31m-	        /* Traverse both arrays from left to right to find optimum j - i [m
[31m-	            This process is similar to merge() of MergeSort */[m
[31m-	        int i = 0, j = 0, maxDiff = -1; [m
[31m-	        while (j < n && i < n) { [m
[31m-	            if (LMin[i] <= RMax[j]) { [m
[31m-	                maxDiff = Integer.max(maxDiff, j - i); [m
[31m-	                j++; [m
[31m-	            } else[m
[31m-	                i++;[m
[31m-	        }[m
[31m-	        return maxDiff; [m
[31m-	    }[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayMaxNumberInTwo.java b/src/com/example/ArrayMaxNumberInTwo.java[m
[1mdeleted file mode 100644[m
[1mindex 8494520..0000000[m
[1m--- a/src/com/example/ArrayMaxNumberInTwo.java[m
[1m+++ /dev/null[m
[36m@@ -1,43 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayMaxNumberInTwo {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		int[] L = { 1, 12, }; [m
[31m-        int[] R = { 13,30, }; [m
[31m-        int n = L.length; [m
[31m-        System.out.println(maximumOccuredElement(L, R, n));[m
[31m-	}[m
[31m-	[m
[31m-	[m
[31m-	static int MAX = 35; [m
[31m-	  [m
[31m-    // Return the maximum occurred element in all ranges. [m
[31m-    static int maximumOccuredElement(int[] L, int[] R, int n) [m
[31m-    { [m
[31m-        // Initalising all element of array to 0. [m
[31m-        int[] arr = new int[MAX]; [m
[31m-  [m
[31m-        // Adding +1 at Li index and  [m
[31m-        // substracting 1 at Ri index. [m
[31m-        for (int i = 0; i < n; i++) { [m
[31m-            arr[L[i]] += 1; [m
[31m-            arr[R[i] + 1] -= 1; [m
[31m-        } [m
[31m-  [m
[31m-        // Finding prefix sum and index [m
[31m-        // having maximum prefix sum. [m
[31m-        int msum = arr[0]; [m
[31m-        int ind = 0; [m
[31m-        for (int i = 1; i < MAX; i++) { [m
[31m-            arr[i] += arr[i - 1]; [m
[31m-            if (msum < arr[i]) { [m
[31m-                msum = arr[i]; [m
[31m-                ind = i; [m
[31m-            } [m
[31m-        } [m
[31m-  [m
[31m-        return ind; [m
[31m-    } [m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayMissing.java b/src/com/example/ArrayMissing.java[m
[1mdeleted file mode 100644[m
[1mindex c2065dc..0000000[m
[1m--- a/src/com/example/ArrayMissing.java[m
[1m+++ /dev/null[m
[36m@@ -1,60 +0,0 @@[m
[31m-package com.example;[m
[31m-//Smallest Positive missing number[m
[31m-class ArrayMissing{[m
[31m-	[m
[31m-	public static void main(String[] args) {[m
[31m-		int[] missingNumber= {1,-12,11,10,0,9};[m
[31m-		System.out.println(missingNumber(missingNumber, missingNumber.length));[m
[31m-		[m
[31m-	}[m
[31m-    [m
[31m-    static int segregate (int arr[], int size)[m
[31m-    {[m
[31m-        int j = 0, i;[m
[31m-        for(i = 0; i < size; i++)[m
[31m-        {[m
[31m-           if (arr[i] <= 0)  [m
[31m-           {[m
[31m-               int temp;[m
[31m-               temp = arr[i];[m
[31m-               arr[i] = arr[j];[m
[31m-               arr[j] = temp;[m
[31m-               j++;  // increment count of non-positive integers [m
[31m-           }[m
[31m-        } [m
[31m-        return j;[m
[31m-    }[m
[31m-    [m
[31m-    static int findMissingPositive(int arr[], int size)[m
[31m-    {[m
[31m-      // Mark arr[i] as visited by making arr[arr[i] - 1] negative. [m
[31m-      // Note that 1 is subtracted because index start [m
[31m-      // from 0 and positive numbers start from 1 [m
[31m-      int i;[m
[31m-      for(i = 0; i < size; i++)[m
[31m-      {[m
[31m-        if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)[m
[31m-          arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];[m
[31m-      }[m
[31m-      // Return the first index value at which is positive [m
[31m-      for(i = 0; i < size; i++)[m
[31m-        if (arr[i] > 0)// 1 is added because indexes start from 0 [m
[31m-          return i+1;[m
[31m-      return size+1;[m
[31m-    }[m
[31m-    [m
[31m-    static int missingNumber(int arr[], int size)[m
[31m-    {[m
[31m-        // First separate positive and negative numbers[m
[31m-        int shift = segregate (arr, size);[m
[31m-        int arr2[] = new int[size-shift];[m
[31m-        int j=0;[m
[31m-        for(int i=shift;i<(size);i++)[m
[31m-        {[m
[31m-            arr2[j] = arr[i];[m
[31m-            j++;[m
[31m-        }    [m
[31m-       return findMissingPositive(arr2, j);[m
[31m-    }[m
[31m-    [m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayRearrangeElement.java b/src/com/example/ArrayRearrangeElement.java[m
[1mdeleted file mode 100644[m
[1mindex 5068363..0000000[m
[1m--- a/src/com/example/ArrayRearrangeElement.java[m
[1m+++ /dev/null[m
[36m@@ -1,51 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-import java.util.Arrays;[m
[31m-[m
[31m-public class ArrayRearrangeElement {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		int[] rearrange= {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};[m
[31m-		rearrangeData(rearrange, rearrange.length);[m
[31m-		Arrays.stream(rearrange).forEach(elelemnt->System.out.print(elelemnt+" "));[m
[31m-	[m
[31m-[m
[31m-	}[m
[31m-	[m
[31m-	[m
[31m-//	Here, We will use the formula Dividend = Divisor * Quotient + Remainder[m
[31m-//			where Divisor = max_element[m
[31m-//			           Quotient = New number at index i after rearrangement[m
[31m-//			           Remainder = Old Number at index i before rearrangement[m
[31m-//			           Dividend = The number stored at index i[m
[31m-	 public static void rearrangeData(int arr[], int n)[m
[31m-	    {[m
[31m-	        // initialize index of first minimum and first [m
[31m-	    	// maximum element [m
[31m-	    	int max_idx = n - 1, min_idx = 0; [m
[31m-	    [m
[31m-	    	// store maximum element of array [m
[31m-	    	int max_elem = arr[n - 1] + 1; [m
[31m-	    [m
[31m-	    	// traverse array elements [m
[31m-	    	for (int i = 0; i < n; i++) { [m
[31m-	    		// at even index : we have to put maximum element [m
[31m-	    		if (i % 2 == 0) { [m
[31m-	    			arr[i] += (arr[max_idx] % max_elem) * max_elem; [m
[31m-	    			max_idx--; [m
[31m-	    		} [m
[31m-	    [m
[31m-	    		// at odd index : we have to put minimum element [m
[31m-	    		else { [m
[31m-	    			arr[i] += (arr[min_idx] % max_elem) * max_elem; [m
[31m-	    			min_idx++; [m
[31m-	    		} [m
[31m-	    	} [m
[31m-	    [m
[31m-	    	// array elements back to it's original form [m
[31m-	    	for (int i = 0; i < n; i++) [m
[31m-	    		arr[i] = arr[i] / max_elem;[m
[31m-	        [m
[31m-	    }[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayRearrangeWithCurrentIndex.java b/src/com/example/ArrayRearrangeWithCurrentIndex.java[m
[1mdeleted file mode 100644[m
[1mindex a9491e9..0000000[m
[1m--- a/src/com/example/ArrayRearrangeWithCurrentIndex.java[m
[1m+++ /dev/null[m
[36m@@ -1,32 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-import java.util.Arrays;[m
[31m-[m
[31m-public class ArrayRearrangeWithCurrentIndex {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-		long[] rearrange= {4 ,0 ,2 ,1 ,3};[m
[31m-		arrange(rearrange,rearrange.length);[m
[31m-		Arrays.stream(rearrange).forEach(elelemnt->System.out.print(elelemnt+" "));[m
[31m-[m
[31m-		[m
[31m-	}[m
[31m-	[m
[31m-	[m
[31m-	static void arrange(long arr[], int n)[m
[31m-    {[m
[31m-       [m
[31m-        int i = 0;[m
[31m-        [m
[31m-        // changing the array elements[m
[31m-        for(i = 0; i < n; i++)[m
[31m-         arr[(int)i]+=(arr[(int)arr[(int)i]]%n)*n;[m
[31m-        [m
[31m-        // this step will rearrange the elements finally[m
[31m-        for(i = 0; i < n; i++)[m
[31m-            arr[(int)i] = arr[(int)i]/n;[m
[31m-    [m
[31m-    }[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArraySortedRotated.java b/src/com/example/ArraySortedRotated.java[m
[1mdeleted file mode 100644[m
[1mindex 031c08f..0000000[m
[1m--- a/src/com/example/ArraySortedRotated.java[m
[1m+++ /dev/null[m
[36m@@ -1,66 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArraySortedRotated {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-		[m
[31m-		int[] soartedRotated= {40,30,20,60,50};[m
[31m-		System.out.println(checkRotatedAndSorted(soartedRotated,soartedRotated.length));[m
[31m-[m
[31m-	}[m
[31m-	[m
[31m-	[m
[31m-	 public static boolean checkRotatedAndSorted(int a[], int n){[m
[31m-	        [m
[31m-	        // Your code here[m
[31m-	        [m
[31m-	         int minInd=0,maxInd=0;[m
[31m-	    [m
[31m-	        // find index with min and max element[m
[31m-		    for(int i=0;i<n;i++){[m
[31m-		        [m
[31m-		        if(a[i] < a[minInd])[m
[31m-		            minInd = i;[m
[31m-		        else if(a[i] > a[maxInd])[m
[31m-		            maxInd = i;[m
[31m-		    }[m
[31m-		    [m
[31m-		    //not sorted and rotated[m
[31m-		    if(Math.abs(minInd - maxInd) != 1){[m
[31m-		     [m
[31m-		        return false;[m
[31m-		    }[m
[31m-		    [m
[31m-		    // increasing order or decreasing order[m
[31m-		    boolean sorted = true;[m
[31m-	        if(maxInd < minInd){[m
[31m-	    	   [m
[31m-	    	   // for increasing order [m
[31m-	    	    for(int i=0;i<n-1;i++){[m
[31m-	    	        [m
[31m-	    	        if(a[(minInd+i)%n] > a[(minInd+i+1)%n]){[m
[31m-	    	         [m
[31m-	    	            sorted = false;[m
[31m-	    	            break;[m
[31m-	    	        }[m
[31m-	    	    }[m
[31m-	        }[m
[31m-		    else{[m
[31m-		        // for decreasing order[m
[31m-		        for(int i=0;i<n-1;i++){[m
[31m-	    	        [m
[31m-	    	        if(a[(minInd+n-i)%n] > a[(minInd+n-i-1)%n]){[m
[31m-	    	         [m
[31m-	    	            sorted = false;[m
[31m-	    	            break;[m
[31m-	    	        }[m
[31m-	    	    }[m
[31m-		    }[m
[31m-[m
[31m-		    if(sorted) return true;[m
[31m-		    else return false;[m
[31m-	        [m
[31m-	    }[m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/ArrayTrapWater.java b/src/com/example/ArrayTrapWater.java[m
[1mdeleted file mode 100644[m
[1mindex 80e88dc..0000000[m
[1m--- a/src/com/example/ArrayTrapWater.java[m
[1m+++ /dev/null[m
[36m@@ -1,39 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class ArrayTrapWater {[m
[31m-[m
[31m-	public static void main(String[] args) {[m
[31m-		// TODO Auto-generated method stub[m
[31m-         int[] trapWater= {0 ,0,0,0 ,0,3};[m
[31m-         System.out.println(trappingWater(trapWater,trapWater.length));[m
[31m-	}[m
[31m-	[m
[31m-	 static int trappingWater(int arr[], int n) { [m
[31m-	        int leftMax = 0, rightMax = 0, res = 0;[m
[31m-	        int low = 0, high = n-1;[m
[31m-	        while(low <= high){[m
[31m-	            [m
[31m-	            // update the max on left[m
[31m-	            if(arr[low] < arr[high]){[m
[31m-	                if(arr[low] > leftMax){[m
[31m-	                    leftMax = arr[low];[m
[31m-	                } else {[m
[31m-	                    res += leftMax-arr[low];[m
[31m-	                }[m
[31m-	                low++;[m
[31m-	            } [m
[31m-	            [m
[31m-	            // else, update the max on right[m
[31m-	            else {[m
[31m-	                if(arr[high] > rightMax){[m
[31m-	                    rightMax = arr[high];[m
[31m-	                } else {[m
[31m-	                    res += rightMax-arr[high];[m
[31m-	                }[m
[31m-	                high--;[m
[31m-	            }[m
[31m-	        }[m
[31m-	        return res;[m
[31m-	    } [m
[31m-[m
[31m-}[m
[1mdiff --git a/src/com/example/BinaryCountElement.java b/src/com/example/BinaryCountElement.java[m
[1mdeleted file mode 100644[m
[1mindex 36360e0..0000000[m
[1m--- a/src/com/example/BinaryCountElement.java[m
[1m+++ /dev/null[m
[36m@@ -1,97 +0,0 @@[m
[31m-package com.example;[m
[31m-[m
[31m-public class BinaryCountElement {[m
[31m-[m
[31m-    public static  void main(String[] args){[m
[31m-        int[] countElementsInTheArray={3 ,1 ,2 ,2 ,1 ,2 ,3 ,3};[m
[31m-        System.out.println(countOccurence(countElementsInTheArray,countElementsInTheArray.length,3));[m
[31m-    }[m
[31m-[m
[31m-    // Prints elements with more than n/k occurrences in arr[] of[m
[31m-    // size n. If there are no such elements, then it prints nothing.[m
[31m-    static int countOccurence(int arr[], int n, int k)[m
[31m-    {[m
[31m-        int count = 0;[m
[31m-[m
[31m-        // k must be greater than 1 to get some output[m
[31m-        if(k < 2)[m
[31m-            return 0;[m
[31m-        /* Step 1: Create a temporary array (contains element[m
[31m-	        and count) of size k-1. Initialize count of all[m
[31m-	       elements as 0 */[m
[31m-        eleCount temp[] = new eleCount[k];[m
[31m-[m
[31m-        for(int i = 0; i < k; i++)[m
[31m-            temp[i] = new eleCount(0, 0);[m
[31m-[m
[31m-        /* Step 2: Process all elements of input array */[m
[31m-        for (int i = 0; i < n; i++)[m
[31m-        {[m
[31m-            int j = 0;[m
[31m-[m
[31m-    		/* If arr[i] is already present in[m
[31m-    		the element count array, then increment its count */[m
[31m-            for (j=0; j<k; j++)[m
[31m-            {[m
[31m-                if (temp[j].e == arr[i])[m
[31m-                {[m
[31m-                    temp[j].c += 