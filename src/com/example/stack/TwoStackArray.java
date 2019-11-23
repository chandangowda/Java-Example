package com.example.stack;

class TwoStack
{
    int size;
    int top1,top2;
    int arr[] = new int[100];
    TwoStack()
    {
        size = 100;
        top1 = -1;
        top2 = size;
    }
}

public class TwoStackArray {

    void push1(int x, TwoStack sq) {
        // pushing element to the top of first stack
        if (sq.top1 < sq.top2 - 1) {
            sq.top1++;
            sq.arr[sq.top1] = x;
        }
    }

    void push2(int x, TwoStack sq) {

        // pushing element to the top of second stop
        if (sq.top1 < sq.top2 - 1) {
            sq.top2--;
            sq.arr[sq.top2] = x;
        }
    }

    int pop1(TwoStack sq) {
        // removing element from the top of first stack
        if (sq.top1 >= 0) {
            int x = sq.arr[sq.top1];
            sq.top1--;
            return x;
        } else {
            return -1;
        }
    }

    int pop2(TwoStack sq) {
        // removing element from the top of second stack
        if (sq.top2 < sq.size) {
            int x = sq.arr[sq.top2];
            sq.top2++;
            return x;
        } else {
            return -1;
        }
    }
}
