package com.example.hashing;

import java.util.HashMap;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
      /*  int[] array={-15, 47, -9, 49, 0, -28, 40 ,12, -32 ,7 ,-24 ,2 ,36, -17, -4, 35, -44, 14, 25 ,5, 31, 4,
                -49, -20, -38 ,35, -40 ,-42, -6, -11, 37, 29, -13, 31, 29 ,-11 ,-47, -29, -48, -29, 29, -22, 23,
                -33 ,11, 21 ,4 ,17 ,-15, -21, -28, 19, 34, -27 ,1, 46, 10, 11, 6, 6, -50 ,-6, -14, 39, -25, 17 ,-21 ,30,
                38 ,-19, 4, -31 ,9 ,-23, 38 ,-30 ,1, -7, -11, -12, -26};*/
      int[] array={10 ,2 ,-2 ,-20, 10};
        System.out.println(subArraySum(array,array.length,-10));
    }

    static int subArraySum(int arr[], int n, int sum)
    {
        int mod[] = new int[n];
        mod[0] = arr[0];

        // storing the prefix sum
        for(int i=1;i<mod.length;i++)
        {
            mod[i] = arr[i] + mod[i-1];
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        hm.put(0,1);

        // iterate over the array
        // and check if you can find the mod[i] - sum
        // if it is there in hash, then add the count of that
        for(int i=0;i<mod.length;i++)
        {
            int find = mod[i] - sum;
            if(hm.containsKey(find))
            {
                int v = hm.get(find);
                count+=v;
            }
            else if(find == 0)
            {
                count+=1;
            }
            if(hm.containsKey(mod[i]))
            {
                int v = hm.get(mod[i]);
                hm.put(mod[i],v+1);
            }
            else
            {
                hm.put(mod[i],1);
            }
        }
        return count;
    }
}
