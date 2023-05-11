package com.nikolanew.testingnew.helper.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

    public static void main(String[] args) throws ParseException {
        String dateString = "11-05-2022";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
        Date date = simpleDateFormat.parse(dateString);

        System.out.println(date);
    }

}
