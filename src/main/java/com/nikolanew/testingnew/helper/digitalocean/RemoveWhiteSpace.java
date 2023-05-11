package com.nikolanew.testingnew.helper.digitalocean;

public class RemoveWhiteSpace {

    public static void main(String[] args) {
        var text = "nikola s";
        var sb = new StringBuffer();
        for (char i: text.toCharArray()) {
            if (!Character.isWhitespace(i)) {
                sb.append(i);
            }
        }

        System.out.println(sb.toString());

        String s = "  abc  def\t";
        s = s.strip();
        System.out.println(s);
    }

}
