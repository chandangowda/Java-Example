package com.example.string;

public class RotationSTringCheck {

    public static void main(String[] args) {
        System.out.println(areRotations("geeksforgeeks","forgeeksgeeks"));
    }

    public static boolean areRotations(String s, String x) {

        // Concatenate both strings and check if another string
        // occurs in the first as substring, if yes, then
        // it is rotated version, else not
        if ((s.length() == x.length()) && ((s + s).contains(x))) {
            return true;

        }
        return false;
    }
}
