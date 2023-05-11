package com.nikolanew.testingnew.helper.l2;

public class CountAndSay {
// count - number
public static void main(String[] args) {
    countAndSay(4-1);
}

    public static String countAndSay(int n) {
        var s = "1";
        for (int i = 1; i < n; i++) {
            s = count(s);
        }

        return s;
    }

    private static String count(String s) {
        StringBuilder sb = new StringBuilder();
        char c = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                sb.append(count);
                sb.append(c);
                c = s.charAt(i);
                count = 1;
            }
        }
        sb.append(count);
        sb.append(c);
        return sb.toString();
    }

}
