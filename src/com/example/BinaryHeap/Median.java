package com.example.BinaryHeap;

import java.util.Collections;
import java.util.PriorityQueue;


//Given an input stream of N integers. The task is to insert these numbers into a new stream and
//find the median of the stream formed by each insertion of X to the new stream.
public class Median {

    static PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder()); //Max heap for lower values
    static PriorityQueue<Integer> min = new PriorityQueue<>(); // Min heap for greater values

    // Function to insert heap
    // insert in minheap or maxheap
    public static void insertHeap(int x) {
        if (max.isEmpty() == true)
            max.add(x);
        else if (x > max.peek())
            min.add(x);
        else if (min.isEmpty() == true) {
            min.add(max.peek());
            max.poll();
            max.add(x);
        } else max.add(x);
        balanceHeaps();

    }

    // Function to balance Heaps
    public static void balanceHeaps() {
        if (Math.abs(max.size() - min.size()) > 1) {
            if (max.size() > min.size()) {
                min.add(max.peek());
                max.poll();
            } else {
                max.add(min.peek());
                min.poll();
            }
        }
    }

    // Function to getMedian
    public static double getMedian() {
        double median = 0.0; //Stores current median
        // if total size is even
        if ((max.size() + min.size()) % 2 == 0) {
            median = (max.peek() + min.peek());
            median /= 2;
        } else // if total size is even
        {
            if (min.isEmpty())
                median = max.peek();
            else if (min.size() < max.size())
                median = max.peek();
            else
                median = min.peek();
        }

        return median;
    }
}
