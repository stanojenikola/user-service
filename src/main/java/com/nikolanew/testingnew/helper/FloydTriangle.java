package com.nikolanew.testingnew.helper;

import java.util.Scanner;

public class FloydTriangle {

    public static void main(String[] args) {
        System.out.println("Please enter the number: ");
        Scanner scanner = new Scanner(System.in);
        printFlyidTriangle(scanner.nextInt());

        int num = 123456;
        char[] charArray = Character.toChars(num);

    }

    static void printFlyidTriangle(int rows) {
        int number = 1;
        System.out.printf("For the numbers of rows %d is %n ", rows);

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
