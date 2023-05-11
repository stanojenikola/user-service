package com.nikolanew.testingnew.helper.java672;

import static org.junit.Assert.*;

import java.util.HashSet;
import org.junit.Test;

public class PrintFirstNotRepetedCharactersFromTheString {

    private static char notRepeted(String str) {
        var set = new HashSet<Character>();
        for (char c: str.toCharArray()) {
            set.add(c);
        }
        return set.toArray(new Character[set.size()])[0];
    }



    @Test
    public void test() {
        assertEquals('a', notRepeted("abcbc"));
    }

}
