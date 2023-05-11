package com.nikolanew.testingnew.helper.leecode;

public class FindIndexOftheFirstOccurrenceInAString {

    public static void main(String[] args) {
        System.out.println(firstOccurence("nikola", "la"));
    }
    static int firstOccurence(String heystack, String needle) {
        if (heystack.contains(needle)) {
            return heystack.indexOf(needle);
        }

        return -1;
    }

}
