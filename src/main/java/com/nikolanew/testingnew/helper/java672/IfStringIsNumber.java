package com.nikolanew.testingnew.helper.java672;

public class IfStringIsNumber {

    public static void main(String[] args) {
var s = "13a3";

        if(s.matches("[0-9]+")) {
            System.out.println("is number");
        } else {
            System.out.println("is not a number");

        };
    }

}
