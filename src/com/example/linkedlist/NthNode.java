package com.example.linkedlist;

public class NthNode extends LinkedList {

    /*
    * Another approach to use slow and fast pointer move first fast pointer for desired  given length and
    * then start moving slow pointer */


    int getNthFromLast(Node head, int n) {
        int len = 0;
        Node temp = head;
        while (temp != null)                 // Traverse temp throught the linked list and find the length
        {
            temp = temp.next;
            len++;
        }
        if (len < n)
            return -1;
        //System.out.println(count);
        //int r = count - n;
        temp = head;
        for (int i = 1; i < len - n + 1; i++)            // Traverse the node till the position from begining:   length - n +1.
            temp = temp.next;
        return temp.data;

    }
}
