package com.nikolanew.testingnew.helper.digitalocean;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playstudio {

    // 0.5=1000,0.3=5000,0.15=10000,0.05=1000000
    //Public int getRandomPrize(String distribution)
    public static void main(String[] args) {

    }


    public int getRandomPrize(String distribution) {
        if (distribution == null) {
            return 0;
        }
        if (!distribution.contains(",")) {
            var arr = distribution.split("=");
            return arr.length > 1 ? Integer.valueOf(arr[0]) : 0;
        }

        List<String> list = Arrays.asList(distribution.split(","));
        Map<Double, Integer> map = new HashMap<>();

        for (String l : list) {
            var arr = l.split("=");
            if (arr.length > 1) {
                map.put(Double.valueOf(arr[0]), Integer.valueOf(arr[1]));
            }
        }

        //

        //if (distribution.split(","))

        return 0;
    }
}
