package com.nikolanew.testingnew.helper.digitalocean;

public class VowelCheck {


    public static void main(String[] args) {

        if ("nikola".toLowerCase().matches(".*[aioue].*")) {
            System.out.println("is vowel");
        }
    }

}