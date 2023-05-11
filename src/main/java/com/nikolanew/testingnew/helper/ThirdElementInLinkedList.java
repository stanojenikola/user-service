package com.nikolanew.testingnew.helper;

public class ThirdElementInLinkedList {


    static class Node {

        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return data;
        }

    }

    private Node head;

    private void append(String data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        tail().next = new Node(data);
    }

    Node tail() {
        Node tail = head;
        if (tail.next != null) {
            tail = tail.next;
        }

        return tail;
    }

    int length() {
        int len = 0;
        Node current = head;

        while (current != null) {
            len++;
            current = current.next;
        }

        return len;
    }

    String getLastNode(int n) {
        Node fast = head;
        Node slow = head;

        int start = 1;

        while (fast.next != null) {
            fast = fast.next;
            start++;
            if (start > n) {
                slow = slow.next;
            }
        }
        return slow.data;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        Node current = head;
        while (current != null) {
            stringBuilder.append(current).append("-->");
            current = current.next;
        }
        if (stringBuilder.length() >= 3) {
            stringBuilder.delete(stringBuilder.length() - 3, stringBuilder.length());
        }
        return stringBuilder.toString();
    }

    public static void main(String args[]) {
        ThirdElementInLinkedList list = new ThirdElementInLinkedList();
        list.append("1");
        list.append("2");
        list.append("3");
        list.append("4");
        System.out.println("linked list : " + list);
        System.out.println("The first node from last: " + list.getLastNode(1));
        System.out.println("The second node from the end: " + list.getLastNode(2));
        System.out.println("The third node from the tail: " + list.getLastNode(3));
    }
}
