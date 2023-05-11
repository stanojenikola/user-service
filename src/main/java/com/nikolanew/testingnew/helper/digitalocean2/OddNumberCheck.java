package com.nikolanew.testingnew.helper.digitalocean2;


import java.util.ArrayList;

public class OddNumberCheck {

    public static void main(String[] args) {
        var list = new ArrayList<Integer>();

        for (int i = 0; i <10; i++) {
            list.add(i);
        }

        for (int i: list) {
            if (i % 2 == 0) {
                System.out.println("is not just with odd");
                break;
            }
        }
    }
}
