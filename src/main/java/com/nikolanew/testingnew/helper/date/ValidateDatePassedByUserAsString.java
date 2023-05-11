package com.nikolanew.testingnew.helper.date;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ValidateDatePassedByUserAsString {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        try {
            LocalDate localDate = LocalDate.parse(str);
            System.out.println(localDate);

        } catch (DateTimeParseException dateTimeParseException) {
            System.out.println("invalid date format: " + str);
        }
    }
}
