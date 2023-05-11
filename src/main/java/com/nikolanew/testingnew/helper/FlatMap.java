package com.nikolanew.testingnew.helper;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        System.out.println(
            Arrays.toString(Stream.of(array).flatMap(Stream::of).toArray(String[]::new)));
    }
}
