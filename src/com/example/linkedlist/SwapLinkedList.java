package com.example.linkedlist;

public class SwapLinkedList extends InsertLinkedList {

    /* Driver program to test above functions. Ideally this function
    should be in a separate user class.  It is kept here to keep
    code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        SwapLinkedList llist = new SwapLinkedList();

        // Insert 6.  So linked list becomes 6->NUllist
        llist.append(6);

        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        llist.startPush(7);

        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        llist.startPush(1);

        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        llist.append(4);

        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        llist.insertAfter(llist.head.next, 8);

        System.out.println("\nCreated Linked list is: ");
        llist.printList();
        System.out.println("\nAfter swapping Linked list is: ");
        llist.head=llist.swapkthnode(llist.head,5,5);
        llist.printList();
    }

    // Should swap Kth node from beginning and Kth
    // node from end in list and return new head.
    Node swapkthnode(Node head, int num, int K) {
        if (K > num) return head;
        if (2 * K - 1 == num) return head;

        Node x_prev = null;
        Node x = head;

        Node y_prev = null;
        Node y = head;

        int count = K - 1;
        while (count-- > 0) {
            x_prev = x;
            x = x.next;
        }

        count = num - K;
        while (count-- > 0) {
            y_prev = y;
            y = y.next;
        }

        if (x_prev != null)
            x_prev.next = y;
        if (y_prev != null)
            y_prev.next = x;

        Node temp = x.next;
        x.next = y.next;
        y.next = temp;

        if (K == 1)
            head = y;
        if (K == num)
            head = x;
        return head;
    }
}
