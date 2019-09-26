package com.example;

    /*you are given heights of consecutive buildings. You can move from the roof of a building to the
    roof of next adjacent building.You need to find the maximum number of consecutive steps you can
    put forward such that you gain an increase in altitude.*/
public class StepFromOneBuiToOth {

    public static void main(String[] args) {
        int[] maxStepArray={1,2,3,4};
        int[] maxStepArray1={1,2,2,3,1};
        maxStep(maxStepArray,maxStepArray.length);
    }

    static int maxStep(int arr[], int n){

        int c=0;
        int m=0;

        // iterating over the array elements
        for(long i=1;i<n;i++)
        {
            // check if consecutive elements are increasing
            // if yes, then increase the count
            if(arr[(int)i]>arr[(int)i-1])
                c++;

                // else, update the max
            else
            {
                m= Math.max(c,m);
                c=0;
            }
        }

        m = Math.max(c, m);
        return m;

    }
}
