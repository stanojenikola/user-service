package com.nikolanew.testingnew.helper;

public class CheckIfNumberIsPowerOfTwo {

    public static void main(String[] args) {

        System.out.println(checkPowerOfTwo(100));
        System.out.println(checkPowerOfTwo(4));

    }


    // The symbol & denotes the bitwise AND operator. It evaluates the binary value of given numbers. The binary result of these numbers will be returned to us in base 10. When the & operator starts its operation, it will evaluate the value of characters in both numbers starting from the left.
    private static boolean checkPowerOfTwo(int number){
        if(number <0){
            throw new IllegalArgumentException("number: " + number);
        }
        return ((number & (number -1)) == 0);
    }

}
