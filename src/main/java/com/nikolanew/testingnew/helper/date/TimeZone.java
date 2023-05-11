package com.nikolanew.testingnew.helper.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZone {

    public static void main(String[] args) {
        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));
    }

}
