package com.nikolanew.testingnew.helper.date;

import java.time.LocalDate;
import java.time.Period;

public class NumberOfDaysBetweenTwoDays {

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2000, 11, 29);
        LocalDate date2 = LocalDate.of(2000, 11, 28);
        var a = Period.between(date1,date2);
        System.out.println(a.getDays());
    }
}
