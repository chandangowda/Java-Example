package com.example.string;

public class KeyPadNumRep {

    public static void main(String[] args) {
        String  alpha="amazon";
        task(alpha);
    }

    static void task(String input) {

        // storing keypad strings in the array of string
        // to get the keypad number as per query
        String num[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int len = input.length();
        char[] arr = input.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 8; j++) {
                if (num[j].indexOf(arr[i]) != -1) {
                    System.out.print((j + 2));
                    break;
                }
            }
        }
        System.out.println(" ");
    }
}
