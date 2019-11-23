package com.example.linkedlist;

public class TurtleTherom extends LinkedList {

    int detectLoop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return 1;
            }
        }
        return 0;
    }
}
