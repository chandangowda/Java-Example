package com.example.binary;

import java.io.IOException;

public  class BinaryGFG {
    static int arr[] = {1,2,3,4,4};
    public static void main (String[] args) throws IOException {

           Pair  ans = findRepeating(arr.length);

            System.out.println(ans.a + " " + ans.b);

        }


    static Pair findRepeating(int n)
    {
        // return 0, 0 when n== 0
        if(n == 0)
        {

            return new Pair(0, 0);
        }

        // when all the elements are distinct
        if(n-(arr[n-1]-arr[0]) == 1)
        {

            return new Pair(-1, -1);
        }

        int lo = 0, hi = n-1;
        int mid = 0;

        // apply binary search to find the repeating element
        while(lo < hi)
        {

            mid = (lo+hi)/2;

            if(arr[mid] >= mid + arr[0]){
                lo = mid+1;
            }
            else{
                hi = mid;
            }
        }


        return new Pair(arr[mid],n-(arr[n-1]-arr[0]));
    }
}

class Pair
{
    int a = 0;
    int b = 0;
    Pair(int x, int y)
    {
        a= x;
        b = y;
    }
}
