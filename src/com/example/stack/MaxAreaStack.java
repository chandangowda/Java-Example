package com.example.stack;

import java.util.Stack;

public class MaxAreaStack {

    public static long getMaxArea(long hist[], long n) {

        // Create an empty stack. The stack holds indexes of hist[] array
        // The bars stored in stack are always in increasing order of their
        // heights.
        Stack<Long> s = new Stack<Long>();

        // Initialize max area
        // To store area with top bar as the smallest bar
        // To store top of stack
        long max_area = 0, area_with_top;
        long tp = 0, i = 0;

        // Run through all bars of given histogram
        while (i < n) {

            // If this bar is higher than the bar on top stack, push it to stack
            if (!s.empty()) tp = s.peek();
            if (s.empty() || hist[(int) tp] <= hist[(int) i]) {
                s.push(i++);
            }

            // If this bar is lower than top of stack, then calculate area of rectangle
            // with stack top as the smallest (or minimum height) bar. 'i' is
            // 'right index' for the top and element before top in stack is 'left index'
            else {
                tp = s.peek(); // store the top index
                s.pop(); // pop the top

                // Calculate the area with hist[tp] stack as smallest bar
                area_with_top = hist[(int) tp] * (s.empty() ? i : i - s.peek() - 1);

                // update max area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }

        // Now pop the remaining bars from stack and calculate area with every
        // popped bar as the smallest bar
        while (s.empty() == false) {
            tp = s.peek();
            s.pop();
            area_with_top = hist[(int) tp] * (s.empty() ? i : i - s.peek() - 1);
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
        return max_area;
    }

    public static void main(String[] args) {

        long[] a={6,4,2};

        System.out.println(getMaxArea(a,3));
    }
}
