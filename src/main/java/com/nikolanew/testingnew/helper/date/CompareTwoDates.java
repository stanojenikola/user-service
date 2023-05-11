package com.nikolanew.testingnew.helper.date;

import java.util.Date;

public class CompareTwoDates {

    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis() +1000);

        int result = date1.compareTo(date2);

        System.out.println(result);

        // if - date1 is before date1
        if ( result < 0) {
            System.out.println("date1 Is before");
        } else if (result == 0) {
            System.out.println("Is equal");
        } else {
            System.out.println("date1 Is after");

        }
    }



}
