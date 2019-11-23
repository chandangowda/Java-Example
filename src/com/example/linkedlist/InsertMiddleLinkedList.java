package com.example.linkedlist;

public class InsertMiddleLinkedList extends InsertLinkedList {


    public Node findMid (Node head){
        Node slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;                               // When fast will reach end, slow will be at the mid point
            fast = fast.next.next;                          // Make fast moves two nodes at a time
        }
        return slow;
    }

    public Node insertInMid(Node head, int data){
        Node mid = findMid(head);                           // Mid node will be positioned at the middle
        Node toAdd = new Node(data);

        toAdd.next = mid.next;                              // Make the newNode next as mid next
        mid.next = toAdd;                                   // Make mid next as newNode

        return head;
    }

    public static void main(String[] args) {

        /* Start with the empty list */
        InsertMiddleLinkedList llist = new InsertMiddleLinkedList();

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



        llist.insertInMid(llist.head,10);

        llist.printList();
    }
}
