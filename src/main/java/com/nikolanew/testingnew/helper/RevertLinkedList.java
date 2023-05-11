package com.nikolanew.testingnew.helper;

public class RevertLinkedList {

    static class Node {

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int data() {
            return data;
        }

        public Node next() {
            return next;
        }
    }

    private Node head;

    public RevertLinkedList(Node head) {
        this.head = head;
    }

    void add(Node node) {
        Node current = head;

        while (current != null) {
            if (current.next == null) {
                current.next = node;
                break;
            }

            current = current.next;
        }
    }

    void print() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data() + " ");
            current = current.next;
        }
        System.out.println("");
    }

    void revert() {
        Node pointer = head;
        Node previous = null, current = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            head = current;
        }
    }

    public static void main(String[] args) {
        RevertLinkedList revertLinkedList = new RevertLinkedList(new RevertLinkedList.Node(1));
        revertLinkedList.add(new RevertLinkedList.Node(2));
        revertLinkedList.add(new RevertLinkedList.Node(3));
        revertLinkedList.print();
        revertLinkedList.revert();
        revertLinkedList.print();
    }
}
