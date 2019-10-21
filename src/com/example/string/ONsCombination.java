package com.example.string;


/*Given a binary string S. The task is to count the number of substrings that start and end with 1.
For example, if the input string is “00100101”, then there are three substrings “1001”, “100101” and “101”.*/
public class ONsCombination {

    public static void main(String[] args) {
        String binaryString="01101";
        System.out.println(binarySubstring(binaryString.length(),binaryString));

    }

    public static int binarySubstring(int a, String str) {
        int c = 0;

        // loop to count number of 1s in the string
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '1')
                ++c;
        }
        return (c * (c - 1)) / 2;
    }
}
