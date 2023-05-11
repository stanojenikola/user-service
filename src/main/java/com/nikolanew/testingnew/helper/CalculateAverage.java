package com.nikolanew.testingnew.helper;

import java.util.stream.Stream;

public class CalculateAverage {

    public static void main(String[] args) {
        // System.out.println(calAverage(new int[] {1,2,7,4,5}));

        String a = "5";
        String b = new String("5");

        System.out.println(a.equals(b)); // true
        System.out.println(a == b); // false

        System.out.println(test());

        Stream<Integer> s = Stream.of(5, 10, 20, 50);
        Integer i = s.reduce((integer1, integer2)-> integer2 - integer1).orElse(-1);

        System.out.println(i);

    }

    static boolean test() {
        try { return true; } finally { return false; }

    }

    private static float calAverage(int[] input) {
        var sum = 0.0f;
        for (int n : input) {
            sum = sum + n;
        }
        System.out.println("sum: " +  sum);
        System.out.println("input.length: " +  input.length);

        return sum / input.length;
    }

}

abstract class Test implements TestI {
}

interface TestI {
    String t();
}

