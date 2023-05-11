package com.nikolanew.testingnew.helper.unifonic;

public class Test1 {
    static {
        System.out.println("Static Block 1");
    } {
        System.out.println("Static nikola 1");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void main(String[] args) {
        System.out.println("hello world");
    }


    public int solution(String S) {
        int numberOfOperation = 0;
        long decimal = Long.parseLong(S,2);

        if (decimal <= 100000 && decimal >0 ) {
            while (decimal != 0) {
                if (decimal %2 == 1) {
                    decimal = decimal -1;
                    numberOfOperation++;
                }
                decimal = decimal /2;
                if (decimal != 0) {
                    numberOfOperation++;
                }

            }
        }

        return numberOfOperation;
    }


    public static int solution(int[] A) {
        int len = A.length, moves = 0, sum = 0, min = 0;

        for (int i = 0; i < len; i++)  {
            sum += A[i];

            System.out.println(sum);
            System.out.println(min);
            if (sum < min) {
                moves++;

                // rotate
                int temp = A[i];
                A[i] = A[len-1];
                A[len-1] =  temp;
                i--;
                len--;
            }
            min = Math.min(min, sum);
        }


        return moves;

}
}


class A extends Test1 {
    static {
        System.out.println(",dkdlk");
    }

    A(){
        super();
    }



    public static void main(String[] args) {
        System.out.println("g");
    }
}