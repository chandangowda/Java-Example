package com.example.hashing;

import java.util.ArrayList;

/*Given a string S of lowercase aplhabets, check if it is isogram or not.
An Isogram is a string in which no letter occurs more than once.*/
public class IsoGram {

    public static void main(String[] args) {
        System.out.println(isIsogram("machine"));
    }

    // Function to check if string is Isogram
    //1. Use a hash array of size 26 to store the count of characters.
    static boolean isIsogram(String data) {

        ArrayList<Character> list = new ArrayList<Character>();
        char k[] = data.toCharArray();

        // traversing through the characters of string
        for (int i = 0; i < data.length(); i++) {

            // if list already contains
            // return false
            if (list.contains(k[i])) return false;

                // else add the character to the list
            else list.add(k[i]);
        }
        return true;
    }
}
