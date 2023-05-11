package com.nikolanew.testingnew.helper.multithreading;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TasksTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            executor.execute(new Task(i));

            if (i ==999) {
                executor.shutdown();
            }
        }

    }

    static class Task implements Runnable {
        private final int id;

        public Task(int id) {
            this.id = id;
        }

        public void run() {
            System.out.println("Task " + id + " started");

            // Simulate some work
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Task " + id + " finished");
        }
    }

}
