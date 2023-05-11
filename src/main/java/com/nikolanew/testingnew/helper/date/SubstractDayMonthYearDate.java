package com.nikolanew.testingnew.helper.date;

import java.util.Calendar;
import java.util.Date;

public class SubstractDayMonthYearDate {

    public static void main(String[] args) {
        var date = new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date newDate = calendar.getTime();
        System.out.println(newDate);
    }

}
