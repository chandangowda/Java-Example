package com.example.linkedlist;

public class MergeSortLinkedList extends LinkedList {

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null)
            return head;

        Node middle = getMiddle(head);
        Node nextofmiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextofmiddle);
        Node sortedlist = sortedMerge(left, right);
        return sortedlist;

    }

    public static Node sortedMerge(Node a, Node b) {
        Node result = null;

        if (a == null)
            return b;
        if (b == null)
            return a;


        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    public static Node getMiddle(Node h) {
        if (h == null)
            return h;
        Node fastptr = h.next;
        Node slowptr = h;


        while (fastptr != null) {
            fastptr = fastptr.next;
            if (fastptr != null) {
                slowptr = slowptr.next;
                fastptr = fastptr.next;
            }
        }
        return slowptr;
    }
}
