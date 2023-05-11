package com.nikolanew.testingnew.helper.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class YearOfThePerson {

    public static void main(String[] args) {
        LocalDate bDate = LocalDate.of(1993, 04, 02);
        LocalDate currentDate = LocalDate.now();

        var perion = Period.between(bDate, currentDate);
        System.out.println(perion.getYears());
        System.out.println(perion.getMonths());

        Date date = new Date();
        System.out.println(date);

        System.out.println(date.getTime());
    }

}
