package com.nikolanew.testingnew.helper.java672new;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class IsStringNumber {
    volatile static int num;

    public static void main(String[] args) {
        var str = args[0];

        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {

            if (!String.valueOf(str.charAt(i)).matches("\\d*")) {
                System.out.println("is not number ");
                break;
            }

            if (i == str.length() - 1) {
                System.out.println("is number");
            }
        }

        var l = new ArrayList<String>();
        for (char c : str.toCharArray()) {
            l.add(c + "");
        }

        l.stream().collect(Collectors.joining(","));
    }
}


interface Test {

    void tes();
}


abstract class Animal {
    abstract void test();
}

abstract class Dog extends Animal {}
