package com.nikolanew.testingnew.helper.leecode;

public class Zigzag {

    public static void main(String[] args) {
        System.out.println(convert("nikola", 3));
        System.out.println("test: " + reverse(123));
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE);

        maxArea(new int[] {1,8,6,2,5,4,8,3,7});
    }

    public static int maxArea(int[] height) {
        return (int) (height[0] > height[height.length - 1] ? Math.pow(
                    height[0] - height[height.length - 1], 2)
                    : Math.pow(height[height.length - 1] - height[0], 2));
    }

    public static int reverse(int x) {
        return Integer.valueOf(new StringBuilder("" + x).reverse().toString());
    }

    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuilder str = new StringBuilder();

        int len = s.length();
        int k = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            int index = i;

            while (index < len) {
                str.append(s.charAt(index));

                if (i != 0 && i != numRows - 1) {
                    int k1 = k - (2 * i);
                    int k2 = index + k1;
                    if (k2 < len) {
                        str.append(s.charAt(k2));
                    }
                }

                index = index + k;
            }
        }
        return str.toString();
    }
}
