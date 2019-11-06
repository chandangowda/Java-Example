package com.example.string;

import java.util.Arrays;


//Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("zxvczbtxyzvy"));
    }

    static char nonrepeatingCharacter(String S) {
        int h[] = new int[26];
        Arrays.fill(h, 0);

        // storing the count of each characters
        // in an array (can be called hash)
        for (int i = 0; i < S.length(); i++) {
            h[S.charAt(i) - 'a']++;
        }


        StringBuilder st = new StringBuilder("");

        // iterating through the string and check if
        // count of current character is 1, then that
        // character is the first non-repeating(ocurrence is 1)
        // and break from for loop
        for (int i = 0; i < S.length(); i++) {
            if (h[S.charAt(i) - 'a'] == 1) {
                return (S.charAt(i));

            }
        }

        return '$';
    }
}
