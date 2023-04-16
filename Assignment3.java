package com.company;

class LinkedList {

    // Here we created an object of Node class
    // represent the head of the linked list
    Node head;

    static class Node {
        int value;

        // connect each node to next node
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        // assign values to each linked list node
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);


        // connect each node of linked list to next node
        linkedList.head.next = second;
        second.next = third;
        third.next=fourth;
        fourth.next=fifth;

        // print the linked list
        Node pointer = linkedList.head;
        System.out.print("LinkedList: " );
        while (pointer != null) {
            System.out.print(pointer.value + " ");
            pointer = pointer.next;
        }

        // Find the middle element
        Node ptr1 = linkedList.head;
        Node ptr2 = linkedList.head;

        while (ptr1.next != null) {

            // increase the ptr1 by 2 and ptr2 by 1  and if ptr1 points to last element
            // ptr2 will points to middle element
            ptr1 = ptr1.next;
            if(ptr1.next !=null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        System.out.println("\nMiddle Element: " + ptr2.value);

    }
}