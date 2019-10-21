package com.example.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/*Given an array arr[] of N positive and negative integer pairs, may not be in sorted order.
The task is to pair the positive and negative element in such a way that a positive element is paired with a negative
element of same absolute value. If a pair element is not present for an element, then ignore it.
The output should contain all pairs in increasing order of absolute values.
To print a pair, positive value should be printed before its corresponding negative value.*/
public class PrintOppositePair {

    static HashMap<Integer, Integer> mp = new HashMap<>();
    static HashSet<Integer> s = new HashSet<>();
    static ArrayList<Integer> arr_s = new ArrayList<>();
    public static void main (String[] args)throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while(t-- >0)
        {
            int n = Integer.parseInt(read.readLine());
            int arr[] = new int[n];
            String st[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
            {
                arr[i] = Integer.parseInt(st[i]);

            }
            for(int i = 0; i < n; i++)
            {
                int key = arr[i];
                if(mp.containsKey(key) == true)
                {
                    int freq = mp.get(key);
                    freq++;
                    mp.put(key, freq);
                }
                else mp.put(key, 1);
            }
            // finding elements and its pair
            for(int i = 0;i<n;i++){
                // check if pair exists or not
                // insert the element in set
                if(arr[i] > 0 && mp.containsKey(-arr[i]) == true)
                    s.add(arr[i]);
            }
            Iterator<Integer> i = s.iterator();
            while (i.hasNext())
                arr_s.add(i.next());
            Collections.sort(arr_s);
            StringBuffer sb = new StringBuffer();
            for(Integer x: arr_s)
                sb.append(x + " " + (-1)*(x) + " ");
            if(s.isEmpty() == true)
                System.out.println("0");
            else
                System.out.println(sb);
            mp.clear();
            s.clear();
            arr_s.clear();
        }
    }

}
