package com.example.stack;

public class StackUsingArray {

    int top;
    int arr[] = new int[1000];

    StackUsingArray()
    {
        top = -1;
    }

    /* The method push to push element into the stack */
    void push(int a)
    {
        top += 1; //adding one to total elements
        int max_position = top; //getting index where new element should be inserted
        arr[max_position] = a; //adding element to top
        return;
    }

    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
        if (top == -1) { //-1 equals no elements
            return -1;
        } else {
            int max_to_return = top; //index of top element
            int to_return = arr[max_to_return]; //getting element at top
            top -= 1;  //decreasing by one the number signaling the total of elements...element still exists in array, it is not deleted
            return to_return; //returning element at top
        }
    }
}
