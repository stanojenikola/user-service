package com.nikolanew.testingnew.helper.multithreading;

public class FirstThread extends Thread {

    private int number;

    FirstThread(int num) {
        number = num;
    }

    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println("thread is execuing now with Number: " + number + " i = " + i);
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            FirstThread thread = new FirstThread(i);
            thread.start();
        }
    }

}
