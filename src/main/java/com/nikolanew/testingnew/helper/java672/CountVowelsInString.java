package com.nikolanew.testingnew.helper.java672;

public class CountVowelsInString {


    public static void main(String[] args) {
        var str = "n";
        var count = 0;

        for (char c : str.toCharArray()) {
            switch (c) {
                case 'a':
                case 'o':
                case 'u':
                case 'i':
                case 'e':
                    count++;
                    break;

            }
        }

        System.out.println(count);
    }


}
