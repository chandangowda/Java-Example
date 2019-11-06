package com.example.string;

import java.util.ArrayList;
import java.util.Arrays;

public class LexicographicRank<psvm> {

    static int MOD = 1000000007;

    public static void main(String[] args) {
        findRank("string");
    }

    static void initializeFactorials(int totalLen, ArrayList<Integer> fact) {
        long factorial = 1;
        fact.add((int) 1); // 0!= 1
        for (int curIndex = 1; curIndex < totalLen; curIndex++) {
            factorial = (factorial * curIndex) % MOD;
            fact.add((int) factorial);
        }

    }


    static long findRank(String S) {
        int charCount[] = new int[256];
        Arrays.fill(charCount, 0);

        for (int i = 0; i < S.length(); i++) {
            charCount[S.charAt(i)]++;
            if (charCount[S.charAt(i)] > 1)
                return 0;
        }

        ArrayList<Integer> fact = new ArrayList<>();
        initializeFactorials(S.length() + 1, fact);

        long rank = 1;
        for (int i = 0; i < S.length(); i++) {

            int less = 0;
            for (int ch = 0; ch < S.charAt(i); ch++) {
                less += charCount[ch];
            }
            rank = (rank + ((long) fact.get(S.length() - i - 1) * less)) % MOD;

            charCount[S.charAt(i)]--;
        }
        return rank;


    }


    static int MAX_CHAR = 256;

    // A utility function to find factorial of n
    static int fact(int n) {
        return (n <= 1) ? 1 : n * fact(n - 1);
    }

    // Construct a count array where value at every index
    // contains count of smaller characters in whole string
    static void populateAndIncreaseCount(int[] count, char[] str) {
        int i;

        for (i = 0; i < str.length; ++i)
            ++count[str[i]];

        for (i = 1; i < MAX_CHAR; ++i)
            count[i] += count[i - 1];
    }

    // Removes a character ch from count[] array
    // constructed by populateAndIncreaseCount()
    static void updatecount(int[] count, char ch) {
        int i;
        for (i = ch; i < MAX_CHAR; ++i)
            --count[i];
    }

    // A function to find rank of a string in all permutations
    // of characters
    static int findRank(char[] str) {
        int len = str.length;
        int mul = fact(len);
        int rank = 1, i;

        // all elements of count[] are initialized with 0
        int count[] = new int[MAX_CHAR];

        // Populate the count array such that count[i]
        // contains count of characters which are present
        // in str and are smaller than i
        populateAndIncreaseCount(count, str);

        for (i = 0; i < len; ++i) {
            mul /= len - i;

            // count number of chars smaller than str[i]
            // fron str[i+1] to str[len-1]
            rank += count[str[i] - 1] * mul;

            // Reduce count of characters greater than str[i]
            updatecount(count, str[i]);
        }

        return rank;
    }
}
