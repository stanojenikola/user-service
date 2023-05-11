package com.nikolanew.testingnew.helper.multithreading;

public class Deadlock {

    public static void main(String[] args) throws InterruptedException {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Thread t1 = new Thread(new SyncTread(obj1, obj2), "t1");
        Thread t2 = new Thread(new SyncTread(obj2, obj3), "t2");
        Thread t3 = new Thread(new SyncTread(obj3, obj1), "t3");

        t1.start();
        Thread.sleep(5000);
        t2.start();
        Thread.sleep(5000);
        t3.start();
        Thread.sleep(5000);
    }


}


class SyncTread implements Runnable {

    private Object obj1;
    private Object obj2;

    SyncTread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println("test");

        String name = Thread.currentThread().getName();
        System.out.println(name + " + aquiring lonk on " + obj1);
        synchronized (obj1) {
            System.out.println(name + " acquired lock on " + obj1);
            work();

            System.out.println(name + " acquired lock on " + obj2);
            synchronized (obj2) {
                System.out.println(name + " acquired lock on " + obj2);
                work();
            }
            System.out.println(name + " released lock on " + obj2);
            System.out.println(name + " released lock on "+obj1);
            System.out.println(name + " finished execution.");
        }
    }

    private void work() {

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
