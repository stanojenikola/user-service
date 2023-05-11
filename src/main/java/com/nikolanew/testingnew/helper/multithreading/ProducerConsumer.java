package com.nikolanew.testingnew.helper.multithreading;


import java.util.LinkedList;

public class ProducerConsumer {

    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 2;
    int value = 0;

    public static void main(String[] args) throws InterruptedException {
        ProducerConsumer producerConsumer = new ProducerConsumer();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.producer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producerConsumer.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();

        thread2.join();
    }

    public void producer() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (list.size() == capacity) {
                    // wait until notify()
                    wait();

                }
                System.out.println("in producer: " + value);

                list.add(value++);

                // weak up thread
                notify();

                Thread.sleep(1000);


            }
        }

    }

    public void consumer() throws InterruptedException {

        while (true) {
            synchronized (this) {
                while (list.size() == 0) {
                    // wait until notify()
                    wait();
                }

                var a = list.remove();
                System.out.println("consumer: " + a);

                // weak up thread
                notify();

                Thread.sleep(1000);
            }

        }

    }
}
