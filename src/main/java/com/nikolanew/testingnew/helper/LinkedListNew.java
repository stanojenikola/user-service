package com.nikolanew.testingnew.helper;

import java.util.ArrayList;

public class LinkedListNew {


    public static void main(String[] args) {
        LinkedListNew linkedListNew = new LinkedListNew();
        linkedListNew.insertFirstLink("Don Quixote", 500);

        linkedListNew.insertFirstLink("A Tale of Two Cities", 200);

        linkedListNew.insertFirstLink("The Lord of the Rings", 150);

        linkedListNew.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

        var arr = new int[]{1, 2, 3, 7, 5};
        // subarraySum(arr, 5, 12);

        System.out.println(findMiddle(head));
    }

    static class Node {

        Node next;

        String bookName;
        int milionSold;

        Node(String bookName, int milionSold) {
            this.bookName = bookName;
            this.milionSold = milionSold;
        }

        public void display() {
            System.out.println(bookName + "  " + milionSold);
        }

        public String toString() {
            return bookName;
        }
    }


    static Node head;

    LinkedListNew() {
        head = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void insertFirstLink(String bookName, int miliseconSold) {
        var newNode = new Node(bookName, miliseconSold);

        // connect first link with new Link
        newNode.next = head; // TODO added at the end
        head = newNode;
        System.out.println(head);
    }

    public Node removeFirst() {
        Node nodeReference = head;

        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("empty link list");
        }

        return nodeReference;
    }

    public void display() {
        Node first = head;

        while (first != null) {
            first.display();

            System.out.println("----------------------> " + first.next);
            first = first.next;
            System.out.println();

        }
    }

    public Node find(String bookName) {

        Node first = head;

        if (!isEmpty()) {
            while (bookName != first.bookName) {
                if (first.next == null) {
                    return null;
                } else {
                    first = first.next;
                }
            }
        } else {
            System.out.println("empty l l");
        }

        return first;
    }

    public Node removeLink(String bookName) {
        Node currentNode = head;
        Node previousNode = head;

        while (currentNode.bookName != bookName) {
            if (currentNode.next == null) {
                return null;
            } else {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
        }

        if (currentNode == head) {
            // If you are here that means there was a match
            // in the reference stored in firstLink in the
            // LinkedList so just assign next to firstLink

            head = head.next;
        } else {

            // If you are here there was a match in a Link other

            // than the firstLink. Assign the value of next for

            // the Link you want to delete to the Link that's

            // next previously pointed to the reference to remove

            System.out.println("FOUND A MATCH");

            System.out.println("currentLink: " + currentNode);

            System.out.println("firstLink: " + head);

            previousNode.next = currentNode.next;
        }

        return currentNode;
    }

    int strstr(String s, String x) {

        int i = 0;
        int len = x.length();

        if (s.contains(x)) {
            for (int letter = 0; letter < len; letter++) {
                if (letter == 0) {
                    i = s.indexOf(x.charAt(letter));
                }
                if (s.indexOf(letter) != -1) {
                    return i;
                }

            }

        }
        return -1;
    }

    int A[] = {1, 2, 3, 7, 5};

    // length
    // s - sum
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        int currentSum = 0;
        var list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            currentSum = arr[i];

            for (int j = i+1; j <= n; j++) {
                if (currentSum == s) {
                    list.add(i+1);
                    list.add(j);
                    return list;
                }
                if (currentSum> s || j == n) {
                    break;
                }
                currentSum = currentSum + arr[j];
            }
        }

        list.add(-1);
        return list;
    }


    static int findMiddle(Node h) {
        int length = 0;
        Node middle = h;
        Node current = h;

        while(current.next != null) {
            length++;
            if (length %2 == 0) {
                middle = middle.next;
            }

            current = current.next;
        }

        if (length%2 == 1) {
            middle = middle.next;
        }
        return length;
    }




}
