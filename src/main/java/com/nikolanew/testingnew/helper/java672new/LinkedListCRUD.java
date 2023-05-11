package com.nikolanew.testingnew.helper.java672new;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListCRUD {


    Node head;

    LinkedListCRUD() {
        head = null;


    }


    void addFirst(int id, String book) {
        var newNode = new Node(id, book);
        newNode.next = head; // next  -> old node

        head = newNode; // head -> new node - > chain
    }

    Node removeFirst() {
        Node reference = head;
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("empty list: ");
        }

        return reference;
    }

    boolean isEmpty() {
        return this.head == null;
    }

    void display() {
        Node first = head;
        while (first != null) {

            first.display();
            System.out.println("value: " + first.next);
            first = first.next;
        }
    }

    void recurs(int a) {
        if (a != 0) {
            System.out.println(a);
            recurs(--a);
        }
    }
}

class Node {

    Node next;
    int id;
    String book;

    Node(int id, String book) {
        this.id = id;
        this.book = book;
    }

    public static void main(String[] args) {

        LinkedListCRUD linkedListCRUD = new LinkedListCRUD();
        linkedListCRUD.addFirst(1, "design p");
        linkedListCRUD.addFirst(2, "design p2");
        linkedListCRUD.addFirst(3, "design p3");
        linkedListCRUD.addFirst(4, "design p4");
        linkedListCRUD.addFirst(5, "design p5");
        linkedListCRUD.removeFirst();
        linkedListCRUD.display();
        linkedListCRUD.recurs(5);

        double mean = Stream.of(1, 2, 3, 4)
            .collect(Collectors.teeing(
                Collectors.summingDouble(i -> i),
                Collectors.counting(),
                (sum, n) -> sum / n));

        System.out.println(mean);

        String str = "Welcome to Tutorialspoint!";
        System.out.println(str.lines());
    }


    public void display() {
        System.out.println("id: " + id + "book:  +" + book);
    }

    public String toString() {
        return this.book + " added";
    }
}