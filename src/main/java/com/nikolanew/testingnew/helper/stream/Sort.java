package com.nikolanew.testingnew.helper.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape");

        var bigString = strings.stream().filter(s -> s.contains("e")).map(s -> s + "n").sorted().collect(Collectors.joining(", "));
        System.out.println(bigString);
    }

}
