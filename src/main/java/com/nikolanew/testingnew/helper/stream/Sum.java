package com.nikolanew.testingnew.helper.stream;

import java.util.List;

public class Sum {

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        var sum = list.stream().reduce(0, (a,b) -> a+b);
        var sum2 = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(sum2);
    }
}
