package com.example.linkedlist;

public class InsertLinkedList extends LinkedList {

    //ex:head->15->13->null
    public  void startPush(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    /* This function is in LinkedList class.
   Inserts a new node after the given prev_node. This method is
   defined inside LinkedList class shown above */
    public void insertAfter(Node prev_node, int new_data) {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
       3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }

    /* Appends a new node at the end.  This method is
   defined inside LinkedList class shown above */
    public void append(int new_data) {
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null) {
            head = new Node(new_data);
            return;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }

    public int getCount(Node head){
        int c=0;                       // Initialize count
        while(head!=null){             // Keep moving to next node till it is null.
            head=head.next;
            c++;
        }
        return c;
    }

    /* This function prints contents of linked list starting from
       the given node */
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    /* Driver program to test above functions. Ideally this function
     should be in a separate user class.  It is kept here to keep
     code compact */
    public static void main(String[] args) {
        /* Start with the empty list */
        InsertLinkedList llist = new InsertLinkedList();

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
        System.out.println("\nCreated Linked list Length: "+llist.getCount(llist.head));
    }
}
