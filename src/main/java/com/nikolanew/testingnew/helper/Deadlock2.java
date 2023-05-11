package com.nikolanew.testingnew.helper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Deadlock2 {

  void test() {
      synchronized ("e") {

      }
  }
    public static void main(String[] args) throws InterruptedException {
        String str = "test1";
        String str2 = "test2";
        Set< Integer> map = new HashSet<>();
        map.add(null);
        map.add(null);
        System.out.println(map);

        System.out.println(Math.min(7, 8));

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                synchronized (str) {
                    System.out.println("thread1 locked str");

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (str2) {
                        System.out.println("thread1 locked str2");


                    }
                }

            }
        };

        Thread thread2 = new Thread() {
            @Override
            public void run() {

                synchronized (str2) {
                    System.out.println("thread2 locked str2");

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    synchronized (str) {
                        System.out.println("thread2 locked str");

                    }
                }
            }
        };

        thread1.start();
        thread1.join();
        thread2.start();
    }


}
