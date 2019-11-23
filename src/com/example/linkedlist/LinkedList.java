package com.example.linkedlist;

public abstract class LinkedList {

    Node head;  // head of list

    class Node {

        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }

    }
}
