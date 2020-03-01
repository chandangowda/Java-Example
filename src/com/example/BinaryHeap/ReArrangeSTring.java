package com.example.BinaryHeap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ReArrangeSTring {

    static class Key {
        int freq;
        char ch;

        Key(int freq, char c) {
            this.freq = freq;
            this.ch = c;
        }
    }

    static class KeyComparator implements Comparator<Key> {
        //@Override
        public int compare(Key k1, Key k2) {
            return k2.freq - k1.freq;
        }
    }

    static boolean rearrangeCharacters(String str) {
        final short MAX_CHAR = 26;
        int n = str.length();
        int count[] = new int[MAX_CHAR];

        // Populating array with char and frequencies
        for (int i = 0; i < n; ++i) {
            count[str.charAt(i) - 'a']++;
        }

        // Populating Priority Queue with Keys made from above array
        PriorityQueue<Key> pq = new PriorityQueue<>(new KeyComparator());
        for (char c = 'a'; c <= 'z'; ++c) {
            int val = c - 'a';
            if (count[val] != 0) {
                pq.add(new Key(count[val], c)); // storing pair of no. of characters and character
            }
        }

        str = "";
        Key prev = new Key(-1, '$');
        while (pq.size() != 0) {
            Key k = pq.poll();
            str = str + k.ch; // store the most remaining character in string
            if (prev.freq > 0)
                pq.add(prev); // pushing the elements with remaining freq.
            k.freq--;
            prev = k;
        }
        if (n == str.length())
            return true;
        return false;
    }
}
