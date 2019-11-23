package com.example.linkedlist;

public class CloneLinkedList extends LinkedList {

    class Node {

        int data;
        Node next,arb;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }

    }

    Node copyList(Node head) {
        if (head == null) return head;

        Node t = head;
        while (t != null) {
            Node n = new Node(t.data);
            // n.data=t.data;
            n.next = t.next;
            t.next = n;
            t = n.next;
        }
        t = head;
        Node head2 = head.next;
        while (t != null) {
            if (t.arb == null)
                t.next.arb = null;
            else {
                t.next.arb = t.arb.next;
            }
            t = t.next.next;
        }
        t = head;
        while (t != null) {
            t.next = t.next.next;
            t = t.next;
        }

        return head2;
    }
}
