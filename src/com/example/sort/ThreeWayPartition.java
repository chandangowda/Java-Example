package com.example.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ThreeWayPartition {

    public static void main(String[] args) {
        int[]  threewayPartion={4,3,6,9,7,3,1};
        List<Integer> list=Arrays.stream(threewayPartion).boxed().collect(Collectors.toList());
        System.out.println(threeWayPartition(list,5,7));
    }

    public static  List<Integer> threeWayPartition(List<Integer> A, int lowVal, int highVal) {
        int n = A.size();
        List<Integer> arr = A;
        int start = 0, end = n - 1;
        for (int i = 0; i <= end; ) {
            // swapping the element with those at start
            // if array element is less than lowVal
            if (arr.get(i) < lowVal) {
                int temp = arr.get(i);
                arr.add(i, arr.get(start));
                arr.remove(i + 1);
                arr.add(start, temp);
                arr.remove(start + 1);
                i++;
                start++;
            }

            // swapping the element with those at end
            // if array element is greater than highVal
            else if (arr.get(i) > highVal) {
                int temp = arr.get(i);
                arr.add(i, arr.get(end));
                arr.remove(i + 1);
                arr.add(end, temp);
                arr.remove(end + 1);
                end--;
            }

            // else just move ahead
            else
                i++;
        }
        return arr;
    }
}
