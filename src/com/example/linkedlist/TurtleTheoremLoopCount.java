package com.example.linkedlist;

public class TurtleTheoremLoopCount extends LinkedList {

    int countNodes(Node n) {
        int res = 1;
        Node temp = n;              // Mark the current node in n
        while (temp.next != n) {     // Count till the current Node next is not equal to n
            res++;
            temp = temp.next;
        }
        return res;
    }

    int countNodesinLoop(Node head) {
        Node slow_p = head, fast_p = head;
        while (slow_p != null && fast_p != null && fast_p.next != null)       // Move till the position of the loop
        {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p)
                return countNodes(slow_p);                              // Count nodes with a node present in the loop
        }
        return 0;
    }

}
