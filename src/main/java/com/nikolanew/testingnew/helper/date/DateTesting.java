package com.nikolanew.testingnew.helper.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class DateTesting {

    public static void main(String[] args) {
        isDateGrater();

        System.out.println(reverse("nikola"));
        // How do you get the current date and time in Java?

        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(todayKolkata);
        var simpleFormat = new SimpleDateFormat("MM/dd/YYYY");
        System.out.println(simpleFormat.format(new Date()));

        Locale locale = new Locale("fr", "FR");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String date = dateFormat.format(new Date());
        System.out.print(date);
    }

    public static void isDateGrater() {
        boolean isBefore = LocalDate.parse("2016-06-10")
            .isBefore(LocalDate.parse("2016-06-11"));

        System.out.println(isBefore);
        System.out.println(LocalDate.now().isBefore(LocalDate.parse("2020-04-04")));

    }

    public static String reverse(String str) {
        if (str.length() < 2) {
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static int reverse(int num) {
        int reversed = 0;
        while (num != 0) {
            int rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }

        return reversed;
    }

    @Test
    public void isCorrect() {
        Assert.assertEquals(123, reverse(321));
    }

    @Test
    public void isCorrectStrRev() {
        Assert.assertEquals(new StringBuilder("expected").reverse().toString(), reverse("expected"));
    }


}
