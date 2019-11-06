package com.interview.binarysearch;

public class SumConsecutive {

    public static void main(String[] args) {
        System.out.println(findSum("1abc2x30yz67"));
    }

    public static long findSum(String s) {
        long ans = 0;
        int c = 0;

        // iterating throug each characaters of the string
        // if it is found to be a number then add it to num
        // else continue
        for (int i = 0; i < s.length(); ) {
            int num = 0;

            // check if characters is number
            while (i < s.length() && (int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57) {
                num = num * 10 + Character.getNumericValue(s.charAt(i));
                i++;
            }
            ans = ans + num;
            if (num == 0) {
                i++;
            }

        }

        return ans;
    }
}
