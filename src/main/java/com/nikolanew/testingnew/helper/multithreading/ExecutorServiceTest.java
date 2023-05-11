package com.nikolanew.testingnew.helper.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorServiceTest {

    public static void main(String[] args)
        throws ExecutionException, InterruptedException, TimeoutException {
        /*Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Nikola");
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });*/
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                TimeUnit.SECONDS.toSeconds(2);
                return "test";

            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> future = executorService.submit(callable);
        System.out.println("Done: " + future.isDone());
        var text = future.get(1, TimeUnit.SECONDS);
        System.out.println(text);



    }
}
