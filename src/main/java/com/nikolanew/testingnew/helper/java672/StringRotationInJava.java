package com.nikolanew.testingnew.helper.java672;

public class StringRotationInJava {

    public static void main(String[] args) {
        String a ="IndiaVsEngland";
        String b =  "EnglandIndiaVs";


        if (a.length() == b.length()) {
            String con = a + b;
            System.out.println(con.indexOf(b) != -1);
        }
    }

}
