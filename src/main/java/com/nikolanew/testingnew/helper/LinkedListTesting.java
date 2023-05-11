package com.nikolanew.testingnew.helper;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTesting {
    LinkedListTesting linkedListTesting;
    Node head;
    int count = 0;

    public void addFirst(String name) {
        count++;
        Node node = new Node(count, name);
        node.next = head;
        head = node;
        System.out.println("The new node: " + node);
    }

    public void display() {
        Node first = head;
        while (first != null) {
            System.out.println("Node: " + first.name);
            first = first.next;
        }
    }

    public void removeFirst() {
        if (this.head != null) {
            System.out.println("Removed: " + head.name);
            this.head = head.next;
        }
    }

    public void update(String oldName, String newName) {
        Node first = head;
        while (first != null) {
            if (first.name.equals(oldName)) {
                first.name = newName;
                System.out.println("\"" + oldName + "\" updated to \"" + newName + "\"");
            } else {
                System.out.println("No item found with name: " + oldName);
            }
            first = first.next;
        }
    }

    @Before
    public void init() {
        linkedListTesting = new LinkedListTesting();
        linkedListTesting.addFirst("java");
        linkedListTesting.addFirst("angular");
        linkedListTesting.addFirst("microservice");
        linkedListTesting.addFirst("design patters");
        linkedListTesting.addFirst("sql");
        linkedListTesting.addFirst("spring boot");
        linkedListTesting.addFirst("jvm performance");
        linkedListTesting.addFirst("algorithms");
        linkedListTesting.addFirst("java versions");
    }

    @Test
    public void whenRemoveSecondItemShouldBeFirst() {
        linkedListTesting.removeFirst();
        assertEquals("algorithms", linkedListTesting.head.name);
    }

    @Test
    public void whenUpdateNewResultShouldBePresent() {
        linkedListTesting.display();
        linkedListTesting.update("java versions", "JV");
        assertEquals("JV", linkedListTesting.head.name);
    }
}

class Node {
    int id;
    String name;
    Node next;

    Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}