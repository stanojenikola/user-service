package com.nikolanew.testingnew.helper.digitalocean2;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargest {


    public static void main(String[] args) {
        var list = Arrays.asList(22, 3, 4, 8, 33, 1);
        if (list.size() > 1) {
            Collections.sort(list);
            System.out.println(list.get(list.size() - 2));
        }
    }
}
