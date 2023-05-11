package com.nikolanew.testingnew.helper.java67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {

    public static void main(String[] args) {
        System.out.println(primeFactoriat(24));

    }

    static int largesprimeFactor(int number) {
        int i;
        long copyOfInput = number;
//ex. 24.
        for (i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                copyOfInput /= i; //12;
                i--;
            }
        }
        return i;

    }


    private static ArrayList<Integer> primeFactoriat(int number) {
        int copyOfNumber = number;
        var arrayList = new ArrayList<Integer>();

        for (int i = 2; i <= copyOfNumber; i++) {
            if (copyOfNumber % i == 0) {
                arrayList.add(i);
                copyOfNumber /= i;
                i--;
            }
        }
        return arrayList;
    }

}
