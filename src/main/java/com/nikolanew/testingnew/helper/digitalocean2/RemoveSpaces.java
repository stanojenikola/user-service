package com.nikolanew.testingnew.helper.digitalocean2;

public class RemoveSpaces {

    public static void main(String[] args) {
        var a = "nikola is learing ".replaceAll("\\s", "");
        System.out.println(a);
    }

}
