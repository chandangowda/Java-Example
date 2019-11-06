package com.interview.binarysearch;

import com.sun.java.swing.plaf.motif.resources.motif_de;

//Add any character after getting three consecutive same characters
public class InsertChar {

    public static void main(String[] args) {
        System.out.println(modified("aabbbcc"));
    }

    public static long modified(String a) {
        long ans = 0, same = 1;

        // check for any 3 consecutive same characters
        // if found, then increment the count of characters to be inserted
        for (long i = 1; i < a.length(); i++) {
            if (a.charAt((int) i) == a.charAt((int) i - 1))
                same++;
            else {
                ans += (same - 1) / 2;
                same = 1;
            }
        }

        ans += (same - 1) / 2;
        return ans;
    }
}
