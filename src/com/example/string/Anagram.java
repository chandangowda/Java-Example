package com.example.string;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("geeksforgeeks","gkee"));
    }

    public static boolean isAnagram(String s1, String s2) {
        int h1[] = new int[26];
        int h2[] = new int[26];
        Arrays.fill(h1, 0);

        int i;

        // if number of characters in both string
        // differs, then string cannot be anagram
        if (s1.length() != s2.length()) {
            return false;
        }

        // storing count of characters in first string
        // by incrementing the value corresponding to the
        // array index equal to character number in alphabet(0-25)
        for (i = 0; i < s1.length(); i++) {
            h1[s1.charAt(i) - 'a']++;
        }

        // decrementing the count of characters whenever encountered
        // in the second string
        for (i = 0; i < s2.length(); i++) {
            h1[s2.charAt(i) - 'a']--;
        }


        // iterating over the array in which we stored count
        // to check if count at every index is equal to 0 or not.
        // Count 0 indicates that number of characters in c and d
        // both are same
        for (i = 0; i < 26; i++) {
            if (h1[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
