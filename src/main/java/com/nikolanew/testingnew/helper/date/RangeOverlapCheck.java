package com.nikolanew.testingnew.helper.date;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class RangeOverlapCheck {

    public static void main(String[] args) {
        List<DateRange> dateRanges = new ArrayList<>();
        dateRanges.add(new DateRange(LocalDate.parse("2022-01-01"), LocalDate.parse("2022-01-31")));
        dateRanges.add(new DateRange(LocalDate.parse("2022-02-01"), LocalDate.parse("2022-02-28")));
        dateRanges.add(new DateRange(LocalDate.parse("2022-01-15"), LocalDate.parse("2022-02-15")));
        dateRanges.add(new DateRange(LocalDate.parse("2022-03-01"), LocalDate.parse("2022-03-31")));
        dateRanges.add(new DateRange(LocalDate.parse("2022-02-15"), LocalDate.parse("2022-03-15")));
        boolean hasOverlap = false;
        for (int i = 0; i < dateRanges.size(); i++) {
            DateRange range1 = dateRanges.get(i);
            for (int j = i + 1; j < dateRanges.size(); j++) {
                DateRange range2 = dateRanges.get(j);
                if(range1.isOverlaps(range2)) {
                    hasOverlap = true;
                    System.out.println("The overlap");
                }

            }
        }
    }
}

class DateRange {
    private LocalDate startDate;
    private LocalDate endDate;

    DateRange(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public boolean isOverlaps(DateRange other) {
        return !this.endDate.isBefore(other.startDate) && !other.endDate.isBefore(this.startDate);
    }
}
