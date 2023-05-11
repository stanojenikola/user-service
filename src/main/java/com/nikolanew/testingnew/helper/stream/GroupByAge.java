package com.nikolanew.testingnew.helper.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class GroupByAge {

    record Person(String name, int years) {}

    static List<Person> persons = Arrays.asList(new Person("Alice", 20), new Person("Bob", 30),
        new Person("Charlie", 20), new Person("Dave", 40));

    static Map<Integer, List<Person>> map = persons.parallelStream().collect(Collectors.groupingBy(Person::years));

    public static void main(String[] args) {
        System.out.println(map);
    }

}
