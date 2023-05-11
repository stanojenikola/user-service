package com.nikolanew.testingnew.helper.leecode;

public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("XX"));
    }

    public static int romanToInt(String s) {
        int number = 0 , ans = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
            switch (s.charAt(i)) {
                case 'I':
                    number += 1;
                    break;
                case 'V':
                    number += 5;
                    break;
                case 'X':
                    number += 10;
                    break;
                case 'L':
                    number += 50;
                    break;
                case 'C':
                    number += 100;
                    break;

                case 'M':
                    number += 1000;
                    break;

            }

            if ( 4 * number < ans)  ans -= number;
            else ans += number;
        }

        return ans;
    }

}
