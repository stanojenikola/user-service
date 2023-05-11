package com.nikolanew.testingnew.helper.digitalocean2;

public class VowelCheck {

    public static void main(String[] args) {
        String str = "nikola";

        if (str.matches(".*[aeiuo].*")) {
            System.out.println("is with vowels");
        } else {
            System.out.println("is not with vowels");
        }
    }

}
