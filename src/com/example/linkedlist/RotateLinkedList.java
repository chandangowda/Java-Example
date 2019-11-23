package com.example.linkedlist;

public class RotateLinkedList extends LinkedList {

    public Node rotate(Node head, int k) {
        if (k == 0) return head;                // If K is zero return head as no node needs to be reversed
        Node current = head;
        int count = 1;
        while (count < k && current != null) {              // while count is less than k traverse in linked list
            current = current.next;
            count++;
        }
        if (current == null) return head;                       // If count exceeds size of linkedlist return head
        Node kthNode = current;
        while (current.next != null) current = current.next;    // Take current node to last.
        current.next = head;                    // Make current node next as head
        head = kthNode.next;                    // Make head as kth node next
        kthNode.next = null;                    // Mark kth node next as null
        return head;
    }
}
