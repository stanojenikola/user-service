package com.nikolanew.testingnew.helper.l2;

import java.util.Arrays;

public class IntegerToRom {
    public String intToRoman(int num) {
        String Roman = "";
        String[][] storeIntRoman = {{"1000", "M"}, {"900", "CM"}, {"500", "D"}, {"400", "CD"}, {"100", "C"}, {"90", "XC"}, {"50", "L"}, {"40", "XL"}, {"10", "X"}, {"9", "IX"}, {"5", "V"}, {"4", "IV"}, {"1", "I"}};
        for (int i = 0; i < storeIntRoman.length; i++) {
            System.out.println(Arrays.toString(storeIntRoman));
            while (num >= Integer.valueOf(storeIntRoman[i][0])) {
                Roman += storeIntRoman[i][1];
                num -= Integer.valueOf(storeIntRoman[i][0]);
            }
        }
        return Roman;
    }
}
