package com.example.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IdenticalArray {

    public static HashMap<Long, Long> hm = new HashMap<Long, Long>();

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            String st[] = read.readLine().trim().split("\\s+");

            // iterate through the array elements and store the frequency of element
            // in the map
            for (int i = 0; i < n; i++) {
                long num = Long.parseLong(st[i]);
                if (hm.containsKey(num)) {
                    long freq = hm.get(num);
                    freq++;
                    hm.put(num, freq);
                } else {
                    hm.put(num, (long) 1);
                }
            }
            String st1[] = read.readLine().trim().split("\\s+");

            // iterating through the elements and decrement the frequency this time
            for (int i = 0; i < n; i++) {
                long num = Long.parseLong(st1[i]);
                if (hm.containsKey(num)) {
                    long freq = hm.get(num);
                    freq--;
                    hm.put(num, freq);
                }
            }

            boolean flag = false;

            // print 0, if the map doesn't has 0 in it for any value
            for (Map.Entry<Long, Long> entry : hm.entrySet()) {
                if (entry.getValue() != 0) {
                    flag = true;
                    System.out.println("0");
                    break;
                }
            }

            if (flag == false)
                System.out.println("1");
            hm.clear();
        }
    }
}
