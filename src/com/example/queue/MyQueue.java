package com.example.queue;

public class MyQueue {

    int front;
    int rear;
    int count;
    int arr[] = new int[1000];

    MyQueue() {
        front = 0;
        rear = 0;
    }

    /* The method push to push element
       into the queue */
    void push(int a) {
        // Your code
        if(count==arr.length){
            return ;
        }
        front=front%arr.length;
        arr[front++] = a;
        count++;
    }

    /* The method pop which return the
       element poped out of the queue*/
    int pop() {
        // Your code
        if (count == rear)
            return -1;
        rear=rear%arr.length;
        count--;
        return arr[rear++];

    }
}
