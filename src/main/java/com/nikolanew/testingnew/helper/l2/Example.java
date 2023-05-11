package com.nikolanew.testingnew.helper.l2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Example {

    static List<Employer> employerList;
    static Employer employerMain;


    public static void main(String[] args) {
        var first = new Employer(1, 5, List.of(2, 3));
        var second = new Employer(2, 3, Collections.emptyList());
        var three = new Employer(3, 3, Collections.emptyList());
        employerList = List.of(first, second, three);

        employerMain = first;

        System.out.println(countImportance(employerMain.importance, employerMain.list));
        ArrayList<int[]> a = new ArrayList<>();

    }
//     return Optional.ofNullable(dependencies).orElse(Collections.emptyList());

    private static int countImportance(int currentImportance, List<Integer> dependencies) {
        return employerList.stream()
            .filter(f -> dependencies.stream().anyMatch(b -> b == f.id)).map(f -> f.importance)
            .reduce(currentImportance, (a, b) -> a + b);
    }
}

class Employer {

    int id;
    int importance;
    List<Integer> list;


    Employer(int id, int importance, List<Integer> list) {
        this.id = id;
        this.importance = importance;
        this.list = list;
    }

    public String toString() {
        return "id: " + this.id + " - " + "impor: " + this.importance + " - " + this.list;
    }
}
