package com.example.string;

public class RotationCheck {

    public static void main(String[] args) {
        System.out.println(isRotated("amazon","azonam"));
    }

    public static boolean isRotated(String s1, String s2) {

        if (s1.length() <= 2 || s2.length() <= 2)
            if (s1.equals(s2)) return true;
            else return false;

        if (s1.length() != s2.length()) return false;

        int bt = 0;
        char temp, temp1;
        int flag = 0;
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        char ck[] = new char[c1.length];
        char ak[] = new char[c1.length];

        // Initialize string as anti-clockwise rotation
        // by concatenating substrings of size two from end
        for (int a = 0; a < c1.length - 2; a++) {
            ck[a] = c1[a + 2];
        }

        // Initialize string as clock wise rotation
        // by concatenating subtring of size two from beginning
        ck[c1.length - 2] = c1[0];
        ck[c1.length - 1] = c1[1];
        for (int a = 2; a < c1.length; a++) {
            ak[a] = c1[a - 2];
        }

        ak[0] = c1[c1.length - 2];
        ak[1] = c1[c1.length - 1];

        // check if any of them is equal to string1
        for (int a = 0; a < c1.length; a++) {
            if (ck[a] != c2[a] && ak[a] != c2[a]) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            bt = 1;

        }
        flag = 0;

        if (bt == 1)
            return true;
        else
            return false;

    }
}
