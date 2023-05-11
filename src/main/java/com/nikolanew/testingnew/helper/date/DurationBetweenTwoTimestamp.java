package com.nikolanew.testingnew.helper.date;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationBetweenTwoTimestamp {

    public static void main(String[] args) {
        LocalDateTime localDateTime1 = LocalDateTime.of(2022,01,02, 7,0,0);
        LocalDateTime localDateTime2 = LocalDateTime.of(2022,03,02, 0,0,0);

        Duration duration = Duration.between(localDateTime1, localDateTime2);

        long seconds = duration.getSeconds();
        long minutes = seconds / 60;
        long hours = minutes / 60;

        System.out.printf("%d second, %d minutes, %d hours", seconds, minutes, hours);
    }
}
