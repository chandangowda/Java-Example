package com.example.backtracking;

class Res{
    static String max="";
}
public class LargestSum {

    // function to find maximum integer possible by
    // doing at-most K swap operations on its digits
    public static void findMaximumNum(char ar[], int k,Res r) {
        //r.max = "";
        if (k == 0)
            return;
        //char ar[] = str.toCharArray();
        int n = ar.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                // if digit at position i is less than digit
                // at position j, swap it and check for maximum
                // number so far and recurse for remaining swaps
                if (ar[j] > ar[i]) {
                    char temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;

                    String st = new String(ar);
                    // If current num is more than maximum so far
                    if (Res.max.compareTo(st) < 0) {
                        Res.max = st;
                    }
                    // recurse of the other k - 1 swaps
                    findMaximumNum(ar, k - 1,r);

                    // backtrack
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        String str = "12929";
        int k = 3;
        LargestSum largestSum=new LargestSum();

        Res max=new Res();
        Res.max=str;
        largestSum.findMaximumNum(str.toCharArray(),k,max);
        System.out.println(Res.max);

    }
}
