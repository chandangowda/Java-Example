package com.example.queue;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    Map<Integer, Integer> map;
    int capacity;

    public LRUCache(int N) {

        this.map = new LinkedHashMap<Integer, Integer>();
        this.capacity = N;
    }

    public int get(int x) {
        int key = x;
        if (!map.containsKey(key)) return -1;
        int value = map.get(key);
        if (map.size() > 1) {
            map.remove(key);
            map.put(key, value);
        }
        return value;
    }

    public void set(int x, int y) {
        int key = x;
        int value = y;
        if (!map.containsKey(key)) {
            if (map.size() == capacity) {
                int firstKey = map.keySet().iterator().next();
                map.remove(firstKey);
            }
            map.put(key, value);
        } else {
            map.remove(key);
            map.put(key, value);
        }
    }
}
