package com.example.linkedlist;

public class IntersectionPoint extends LinkedList {

    int intersectPoint(Node headA, Node headB) {
        int c1 = getCount(headA);
        int c2 = getCount(headB);
        int d;

        if (c1 > c2) {
            d = c1 - c2;
            return _getintersectionNode(d, headA, headB);

        } else {
            d = c2 - c1;
            return _getintersectionNode(d, headB, headA);
        }
    }

    int _getintersectionNode(int d, Node node1, Node node2) {
        int i;
        Node current1 = node1;
        Node current2 = node2;
        for (i = 0; i < d; i++) {
            if (current1 == null) {
                return -1;
            }
            current1 = current1.next;
        }
        while (current1 != null && current2 != null) {
            if (current1.data == current2.data) {
                return current1.data;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return -1;
    }

    int getCount(Node node) {
        Node current = node;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
