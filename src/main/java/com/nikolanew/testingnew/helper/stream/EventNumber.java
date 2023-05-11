package com.nikolanew.testingnew.helper.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EventNumber {

    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2, 3, 4, 5);

        var list2 = list.parallelStream().filter((num) -> num % 2== 0).collect(Collectors.toList());
        list2.forEach(System.out::println);
    }

}
