package com.nikolanew.testingnew.helper.java672;

public class DeadLock {


    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();

        Thread thread1 = new Thread(new TestClass(obj1, obj2) , "t1");
        Thread thread2 = new Thread(new TestClass(obj2, obj3) , "t1");
        Thread thread3 = new Thread(new TestClass(obj3, obj1) , "t1");

        thread1.start();

        thread2.start();
        thread3.start();
    }




}

class TestClass implements Runnable {

    private Object obj1;
    private Object obj2;

    TestClass(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }


    @Override
    public void run() {
        var name = Thread.currentThread().getName();
        synchronized (obj1) {
            System.out.println("Lock on object1: " + obj1);
            waitLocal();
            synchronized (obj2) {
                System.out.println("Lock on object2: " + obj2);

                waitLocal();
            }

            System.out.println("realease lock on object2: " + obj2);
        }

        System.out.println("realease lock on object1: " + obj1);

    }

    private void waitLocal() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
