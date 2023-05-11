package com.nikolanew.testingnew.helper.memoryconsumption;

import java.util.Map;
import java.util.Set;

public class MemoryConsuptionAtRuntime {

    private static final long MEGABYTE = 1024L * 1024L;

    public static long bytesToMegabytes(long bytes) {
        return bytes / MEGABYTE;
    }


    public static void main(String[] args) {
        /*List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add(i);
        }
        Runtime runtime = Runtime.getRuntime();

        runtime.gc();
        System.out.println(runtime.availableProcessors());
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Used memory in bytes: " + memory);
        System.out.println("Used memory in megabytes: " + bytesToMegabytes(memory));

         */

        System.out.println(
            "Number of active threads from the given thread: " + Thread.activeCount());
        Map<Thread, StackTraceElement[]> threads = Thread.getAllStackTraces();
    /*
        for (Entry<Thread, StackTraceElement[]> thread : threads.entrySet()) {
            System.out.println(thread.getKey().);
            if (thread.getKey().isAlive() == true) {
                System.out.println(thread.getKey());
                System.out.println(Arrays.toString(thread.getValue()));
                System.out.println("-------------------------------------");
            }


        }

        System.out.println(threads);

*/
        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
        for ( Thread t : threadSet){
            System.out.println("Thread :"+t+":"+"state:"+t.getState());
        }
    }
    /*
    multithreading and concurrency
    docker cmp
    linux cmp
    garbage collection
    advanced java interview questions
    spring

    java
    testing
    design patter
    java new versions
    concurrency
    garbage collection

    kafka
    docker
    spring
    microservices

1.Java performance metric
Business Transactions
External Dependencies
Caching Strategy
Error Rates
Garbage Collection
Application Topology
Log Size
2. Rest best practice
Use Nouns for Resource Identification
Use Plural Nouns to Name a Resource
Use Proper HTTP Headers for Serialization Formats
Get Method and Query Parameters Should Not Alter the State
Use Sub-Resources for Relations
Use Proper HTTP Methods
HTTP Response Status Codes
Field Name Casing Convention
Searching, Sorting, Filtering, and Pagination
Restful API Versioning
     */

    private static String hello = "not another hello world";
/*
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void stringsWithoutStringBuilder() throws Exception {
        String hellos = "";
        for (int i = 0; i < 1000; i++) {
            hellos += hello;
            if (i != 999) {
                hellos += "\n";
            }
        }
        assertTrue(hellos.startsWith((hello + "\n")));
    }
 */

  /*
    @Test
    public void runBenchmarks() throws Exception {
        Options options = new OptionsBuilder()
            .include(this.getClass().getName() + ".*")
            .mode(Mode.AverageTime)
            .warmupTime(TimeValue.seconds(1))
            .warmupIterations(6)
            .threads(1)
            .measurementIterations(6)
            .forks(1)
            .shouldFailOnError(true)
            .shouldDoGC(true)
            .build();

        new Runner(options).run();
    }
*/
}
class A
{
    static int i = 1111;

    static
    {
        System.out.println("i: " + --i);
        i = i-- - --i; //1
        System.out.println("In class-A-Static:"+i);
    }

    {
        System.out.println("i: " + i++);

        i = i++ + ++i;
        System.out.println("In class-A instance:"+i);

    }
}

class B extends A
{
    static
    {
        i = --i - i--;
        System.out.println("In class-B-static:"+i);

    }

    {
        i = ++i + i++;
        System.out.println("In class-B-init:"+i);
    }
}

class Main
{
    public static void main(String[] args)
    {
        B b = new B();

        System.out.println(b.i);

        M m = new M();
        m.test();
    }


}

interface O {
    void test();
    default void t() {
        System.out.println("in i");
    }
}

abstract class O2 {
    abstract void test();
    void t() {
        System.out.println("in a");
    }
}

class M implements O {

    @Override
    public void test() {
        System.out.println("gl");
    }

}

/*
load balanicing server
jmeter
benchmark testing
nginx server
What are the 4 types of system design?
There are four system design processes: developing stakeholder expectations, technical requirements, logical decompositions, and design solutions.

jvm performance
 */