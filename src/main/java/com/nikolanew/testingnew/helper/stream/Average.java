package com.nikolanew.testingnew.helper.stream;

import java.util.Arrays;
import java.util.List;

public class Average {

    public static void main(String[] args) {
        record Person(String name, int years) {}
        List<Person> persons = Arrays.asList(new Person("Alice", 20), new Person("Bob", 30), new Person("Charlie", 20), new Person("Dave", 40));

        double averageYears = persons.stream().mapToInt(Person::years).average().orElse(Double.NaN);
        System.out.println(averageYears);
    }
}
