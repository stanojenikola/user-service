package com.nikolanew.testingnew.helper.digitalocean2;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Nikola";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length()-1; i>=0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        System.out.println(stringBuilder);
    }

}
