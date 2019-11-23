package com.example.linkedlist;

public class RemoveLoopLinkedList extends LinkedList {

   public  static  int detectLoop(Node node) {
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

    public static void removeTheLoop(Node head) {


        if (detectLoop(head) == 0)      // If loop doesn't exist return
            return;

        Node hare = head.next;
        Node tortoise = head;
        while (hare != tortoise)            // find the spot where loop exist
        {
            hare = hare.next;
            tortoise = tortoise.next;
            hare = hare.next;

            if (hare == tortoise)
                break;
        }

        Node begin = head;
        tortoise = tortoise.next;
        while (begin != tortoise) {

            begin = begin.next;
            if (tortoise.next == begin)         // Find the position of the loop and mark the node as null
            {
                tortoise.next = null;
                return;
            }
            tortoise = tortoise.next;


        }

    }
}
