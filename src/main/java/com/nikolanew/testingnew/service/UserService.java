package com.nikolanew.testingnew.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static boolean hasDuplicateUsingSet(String[] data) {
        var set = new HashSet<>(Arrays.asList(data));

        if (data.length == set.size()) {
            return false;
        }

        return true;
    }

    private static String[] duplicateStrings(String[] data) {
        var set = new HashSet<String>();
        var list = new ArrayList<String>();

        for (var s : data) {
            // return false if is added
            var canBeAdded = set.add(s);

            if (!canBeAdded) {
                list.add(s);
            }
        }

        String[] duplicates = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            duplicates[i] = list.get(i);
        }
        return duplicates;
    }



    private static void fibonacciSeries() {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
        n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}


// 1. mid in lined in
class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        tail = head;
    }

    public Node head() {
        return head;
    }

    public void add(Node node) {
        tail.next = node;
        tail = node;
    }

    public static class Node {

        private Node next;
        private String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


    public static void main(String[] args) {
    }
}