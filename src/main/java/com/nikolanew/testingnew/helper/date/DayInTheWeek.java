package com.nikolanew.testingnew.helper.date;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayInTheWeek {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2023,4,29);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
