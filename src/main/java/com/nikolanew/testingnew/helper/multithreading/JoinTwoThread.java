package com.nikolanew.testingnew.helper.multithreading;

public class JoinTwoThread {


    private static class ParallelTask implements Runnable {
        private Thread processor;

        @Override
        public void run() {

            System.out.println("current tread: " + Thread.currentThread().getName());

            if (processor != null) {

                try {
                    processor.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(Thread.currentThread().getName() + " finished.");
        }

        public void setProcessor(Thread t) {
            this.processor = t;
        }
    }


    public static void main(String[] args) {

        ParallelTask task1 = new ParallelTask();
        ParallelTask task2 = new ParallelTask();
        ParallelTask task3 = new ParallelTask();

        Thread t1 = new Thread(task1, "thread -1");
        Thread t2 = new Thread(task2, "thread -2");
        Thread t3 = new Thread(task3, "thread -3");

        task2.setProcessor(t1);
        task3.setProcessor(t2);

        t1.start();
        t2.start();
        t3.start();
    }
}
