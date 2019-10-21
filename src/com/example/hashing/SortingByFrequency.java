package com.example.hashing;

import java.util.*;

public class SortingByFrequency {


    public static void main(String[] args) {
        int[] array={5, 5 ,4, 6, 4};
        sortByFreq(array,array.length);
    }

    static void sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < n; i++)
        {
            int num = arr[i];

            if(map.containsKey(num))
            {
                map.put(num, map.get(num) + 1);
            }
            else
            {
                map.put(num, 0);
            }
        }

        List<Map.Entry<Integer,Integer>> set = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
        Collections.sort(set,new comparator());
        for(int i = 0;i<map.size();i++)
        {
            int count = set.get(i).getValue();
            while(count >= 0)
            {
                System.out.print(set.get(i).getKey() + " ");
                count -- ;
            }
        }
    }
}


class comparator implements Comparator<Map.Entry<Integer,Integer>>
{

    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
    {
        if(o1.getValue() > o2.getValue())
            return -1;
        else if(o1.getValue() == o2.getValue())
            return 0;
        else if(o1.getValue() < o2.getValue())
            return 1;

        return Integer.MIN_VALUE;
    }

}
