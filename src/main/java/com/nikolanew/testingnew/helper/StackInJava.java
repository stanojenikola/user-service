package com.nikolanew.testingnew.helper;

import java.util.Arrays;

public class StackInJava {

    public static void main(String[] args) {
        StackInJava stack = new StackInJava(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("top elelement: " + stack.peek());

        System.out.println("all array: " + stack);

    }

    private int[] arr;
    private int top;
    private int capacity;

    StackInJava(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }


    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow\nProgram Terminated\n");

            System.exit(-1);
        }

        System.out.println("inserting: " + x);
        arr[++top] = x;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("removing: " + peek());
        return arr[top--];
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.exit(-1);
        }
        return -1;
    }



    private boolean isEmpty() {
        return top == -1;
    }

    private boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}
