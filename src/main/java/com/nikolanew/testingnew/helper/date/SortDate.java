package com.nikolanew.testingnew.helper.date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDate {

    public static void main(String[] args) {
        List<LocalDate> list = new ArrayList<>();
        list.add(LocalDate.of(2000, 02,01));
        list.add(LocalDate.of(1999, 02,01));
        list.add(LocalDate.of(2003, 02,01));
        list.add(LocalDate.of(2000, 01,01));
        list.add(LocalDate.of(2000, 02,01));
        list.add(LocalDate.of(2000, 02,01));
        list.add(LocalDate.of(2000, 02,01));
        Collections.sort(list);

        list.forEach(System.out::println);
    }

}
