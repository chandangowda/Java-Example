package com.interview.binarysearch;

import java.util.Arrays;
/*Given a string S consisting of uppercase and lowercase characters. The task is to sort uppercase
and lowercase letters separately such that if the ith place in the original string had an Uppercase character
then it should not have a lowercase character after being sorted and vice versa.*/
public class SortStrings {

    public static void main(String[] args) {
        System.out.println(caseSort("defRTSersUXI"));
    }


    public static String caseSort(String str) {
        char[] mixChArr = str.toCharArray();

        int lIdx = 0;
        int uIdx = 0;

        for (char ch : mixChArr) {
            if (Character.isUpperCase(ch))
                uIdx++;
            else
                lIdx++;
        }

        int upperSize = uIdx;
        int lowerSize = lIdx;

        char[] lowerChArr = new char[lowerSize];
        char[] upperChArr = new char[upperSize];

        lIdx = 0;
        uIdx = 0;

        for (char ch : mixChArr) {
            if (Character.isUpperCase(ch))
                upperChArr[uIdx++] = ch;
            else
                lowerChArr[lIdx++] = ch;
        }
        ;

        Arrays.sort(upperChArr);
        Arrays.sort(lowerChArr);

        lIdx = 0;
        uIdx = 0;

        for (int mIdx = 0; mIdx < mixChArr.length; mIdx++) {
            if (Character.isUpperCase(mixChArr[mIdx])) {
                mixChArr[mIdx] = upperChArr[uIdx++];
            } else {
                mixChArr[mIdx] = lowerChArr[lIdx++];
            }
        }

        String rtnStr = new String(mixChArr);
        return rtnStr;
    }
}
