package com.example.linkedlist;

public class ReverseLinkedList extends InsertLinkedList {

    /* Function to reverse the linked list */
    Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    // A simple and tail recursive function to reverse
    // a linked list.  prev is passed as NULL initially.
    Node reverseUtil(Node curr, Node prev)
    {

        /* If last node mark it head*/
        if (curr.next == null) {
            head = curr;

            /* Update next to prev node */
            curr.next = prev;

            return head;
        }

        /* Save curr->next node for recursive call */
        Node next1 = curr.next;

        /* and update next ..*/
        curr.next = prev;

        reverseUtil(next1, curr);
        return head;
    }

    /* Driver program to test above functions. Ideally this function
    should be in a separate user class.  It is kept here to keep
    code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        ReverseLinkedList llist = new ReverseLinkedList();

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

        llist.head=llist.reverse(llist.head);

        System.out.println("\nReversed Linked list is: ");

        llist.printList();

    }
}
