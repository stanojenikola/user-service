package com.nikolanew.testingnew;

import java.util.*;
import java.text.SimpleDateFormat;

public class CarRental {

    public static void main(String[] args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");

        ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
        rentalTimes.add(
            new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
        rentalTimes.add(
            new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
        rentalTimes.add(
            new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));

        System.out.println(CarRental.canScheduleAll(rentalTimes));

        // System.out.println(amstrongNumber(171));
        // fibonaciSeries();

        System.out.println(revert("nikola"));
    }


    private static String revert(String str) {
        if (str.length() <2) {
            return str;
        }
        return revert(str.substring(1)) + str.charAt(0);

    }
    private static boolean amstrongNumber(int num) {
        int result = 0;
        int stored = num;
        while (stored != 0) {
            int remainder = stored % 10;
            result = result * 10 + remainder;
            stored = stored / 10;
        }
        return num == result;
    }

    static void fibonaciSeries() {
        int n1 = 0, n2 = 1, n3, count = 20;

        for (int i = 2; i < count; i++) {
            n3 = n1+n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }

    }

    public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
        // throw new UnsupportedOperationException("Waiting to be implemented.");
        boolean canSchedule = false;
        for (RentalTime rental: rentalTimes) {
            // if ( rental.getStart(). < rental.getEnd() )
        }
        return true;
    }


}

class RentalTime {

    private Date start, end;

    public RentalTime(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return this.start;
    }

    public Date getEnd() {
        return this.end;
    }
}