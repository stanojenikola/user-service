package com.nikolanew.testingnew.transpefect;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class FileReader {


    public String findWord(Reader reader) throws IOException {
        var br = new BufferedReader(reader);
        String line = null;
        Map<String, Integer> counts = new HashMap<>();
        var max = 0;
        var regex = "[\\s\\p{Punct}]+"; // p{Punct}	Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~

        String mostUsed = null;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(regex);
            for (String word : words) {
                if (!counts.containsKey(word)) {
                    counts.put(word, 1);
                } else {
                    int count = counts.get(word) + 1;
                    counts.put(word, count);
                    if (count > max) {
                        max = count;
                        mostUsed = word;
                    }
                }
            }
        }
        return mostUsed;
    }
    @Test
    public void whenTextPresentedFindMostUsedWords() throws IOException {
        var input = "nikola is learning programing, since nikola like it";
        var expected = "nikola";
        var reader = new StringReader(input);
        var actual = findWord(reader);
        assertEquals(expected, actual);
    }

}
