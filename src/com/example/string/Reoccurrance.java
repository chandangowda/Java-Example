package com.example.string;

/*Given two strings s1 and s2. Modify string s1 such that all the common characters of s1 and s2 is to be removed
and the uncommon characters of s1 and s2 is to be concatenated.*/
public class Reoccurrance {

    public static void main(String[] args) {
        System.out.println(concatenatedString("abcd","cdef"));
    }

    public static String concatenatedString(String s1, String s2) {
        boolean flag1[] = new boolean[26];

        // store all characters of s1 in map
        for (int i = 0; i < s1.length(); i++)
            flag1[s1.charAt(i) - 97] = true;

        // store all characters of s2 in map
        boolean flag2[] = new boolean[26];
        for (int i = 0; i < s2.length(); i++)
            flag2[s2.charAt(i) - 97] = true;


        // Find characters of s1 that are not
        // present in s2 and append to result
        String s = "";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (flag1[ch - 97] && !flag2[ch - 97])
                s = s + ch;
        }

        // Find characters of s2 that are not
        // present in s1.
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (flag2[ch - 97] && !flag1[ch - 97])
                s = s + ch;
        }

        if (s.length() == 0)
            return "-1";
        return s;
    }
}
