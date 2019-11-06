package com.example.string;

import java.util.HashSet;

public class FirstCharacterInSecondString {

    public static void main(String[] args) {
        solution("abcd", "bcdw");
    }

    public static void solution(String s1, String s2) {
        int i = 0, l1 = s1.length(), l2 = s2.length();
        HashSet<Character> hs = new HashSet<Character>();
        for (i = 0; i < l2; i++)
            hs.add(s2.charAt(i));
        for (i = 0; i < l1; i++)
            if (hs.contains(s1.charAt(i)))
                break;
        if (i < l1)
            System.out.print(s1.charAt(i));
        else
            System.out.print("No character present");
    }
}
