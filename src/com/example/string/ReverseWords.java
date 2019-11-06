package com.example.string;

public class ReverseWords {

    public static void main(String[] args) {
        reverseWords("i.like.this.program.very.much\n");
    }


    public static void reverseWords(String s) {

        // storing the string character wise
        // in an array of strings seperating
        // them through comma
        String sd[] = s.split("\\.");

        // for each word in the string array
        // reverse the word and append '.' after that
        for (int i = sd.length - 1; i >= 0; i--) {

            if (i == 0) {
                System.out.print(sd[i]);
            } else
                System.out.print(sd[i] + ".");
        }

    }
}
