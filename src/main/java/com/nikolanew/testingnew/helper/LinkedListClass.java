package com.nikolanew.testingnew.helper;

public class LinkedListClass {

    Node head;

    // Driver code
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedListClass list = new LinkedListClass();

        //
        // ******INSERTION******
        //

        // Insert the values
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        // Print the LinkedList
        printList(list);
        // mid element class
        // System.out.println(list);
        // midElement(list);
        // has cycle
        // System.out.println("cycle: " +isCyclic(list));

    }

    private static boolean isCyclic(LinkedListClass list) {
        Node fast = list.head;
        Node slow = list.head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }



        return false;
    }

    private static void midElement(LinkedListClass list) {
        Node current = list.head;

        int len = 0;

        Node mid = list.head;

        while (current.next != null) {
            len++;
            if (len % 2 == 0) {
                mid = mid.next;
            }
            current = current.next;
        }

        if (len % 2 == 1) {
            mid = mid.next;
        }

        System.out.println("length of LinkedList: " + len);
        System.out.println("middle element of LinkedList : " + mid);
    }

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

        public String toString(){
            return this.data + "";
        }
    }

    public static LinkedListClass insert(LinkedListClass list, int data) {

        var new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
        } else {
            Node last = list.head;

            while (last.next != null) {
                System.out.println("last: " + last.next);
                last = last.next;
            }

            last.next = new_node;
            System.out.println("lastee: " + last.next);


        }

        return list;
    }

    private static void printList(LinkedListClass list) {
        Node currentNode = list.head;
        System.out.println(" current node: " + currentNode);
        while (currentNode != null) {
            currentNode = currentNode.next;
            System.out.println(" next: " + currentNode);

        }
    }


}
