package com.example.linkedlist;

//ex:=1 2 3 4 5 6 7->2 1 4 3 6 5 7
public class PairWiseSwap extends LinkedList {

    public static Node pairwise_swap(Node node) {
        // If linked list is empty or there is only one node in list
        if (node == null || node.next == null) {
            return node;
        }

        // Initialize previous and current pointers
        Node prev = node;
        Node curr = node.next;

        node = curr;  // Change head before proceeeding

        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }

            // Change next of previous to next next
            prev.next = next.next;

            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return node;
    }
}
