package com.nikolanew.testingnew.helper;

import java.util.LinkedList;

// import javax.xml.soap.Node;
public class LinkedListMiddleElement {


    public static void main(String args[]) {


    }

    // 1
    public void linkedListMiddleElement() {

        LinkedList list = new LinkedList();
        list.add(2);
        list.add(3);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(0);
        list.add(9);
        list.add(4);    list.add(2);
        list.add(3);
        list.add(9);
        list.add(4);
        var firstInterator = list.iterator();
        var secondIterator = list.iterator();

        int i = 0;
        int middle = 0;

        while (firstInterator.hasNext()) {
            if (i == 0) {
                firstInterator.next();
                i = 1;

            } else if (i == 1) {
                if (firstInterator.hasNext()) {

                    firstInterator.next();

                    middle = (Integer) secondIterator.next();
                    i = 0;
                }
            }
        }
        System.out.println("middle" + middle);
    }
}