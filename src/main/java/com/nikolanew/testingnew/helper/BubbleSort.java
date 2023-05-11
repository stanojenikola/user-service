package com.nikolanew.testingnew.helper;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BubbleSort {

    private static int[] unsorted = {2, 3, 5, 1, 7, 2};



    public static void main(String[] args) {
/*
        for (int i = 0; i  < unsorted.length; i++) {
            System.out.println("test: " + i);
        }

        for (int i = 0; i  < unsorted.length -1; i++) {
            for(int j = 1; j < unsorted.length -i; j++) {

                if (unsorted[j-1]> unsorted[j]) {
                    int temp = unsorted[j];
                    unsorted[j] = unsorted[j-1];
                    unsorted[j-1] = temp;
                }
            }


        }


        System.out.println(Arrays.toString(unsorted));


        swapNumbers(3, 9);


        simpleSort(unsorted, unsorted.length);

        var s = new String[] {"fls", "flbsss", "fls"};
        longestCommonPrefix(s);
        */

        letterCombinations("23");


    }

    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        var count = 0;

        for (int i = 0; i < N-1;  i++) {
            for (int j = 1; j < N-i;  j++) {
                if (arr[j-1] > arr[j]) {
                    var temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;

                    count++;
                }
            }
        }

        return count;
    }

    /*
       public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;
        for (int i = 0;i < n; i ++) fast = fast.next;
            if (fast ==null) return head.next;
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
FF
        return head;
    }
     */

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> linkedList = new LinkedList<String>();
        if (digits.isEmpty()) return linkedList;
        var mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        linkedList.add("");

        for (int i = 0; i < digits.length(); i++) {
            int d = Character.getNumericValue(digits.charAt(i));

            while(linkedList.peek().length() == i) {
                String t = linkedList.remove();
                for (char s: mapping[d].toCharArray()) {
                    linkedList.add(t+s);
                }

            }

        }
        return linkedList;
    }



    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            System.out.println(strs[i].indexOf(prefix));
            while(strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }



        return prefix;
    }


        static void simpleSort(int arr[], long N)
        {
            // Your Code Here
            var count = 0;

            for (int i = 0; i < N-1;  i++) {
                for (int j = i +1; j < N; j++) {
                    if(arr[i] > arr[j]){
                        var temp = arr[j];
                        arr[j] = arr[i];
                        arr[i]= temp;
                    }
                }
            }

            System.out.println("test: "+ Arrays.toString(arr));
        }


    private static void swapNumbers(int a, int b) {
        var temp = a;
        a = b;
        b =temp;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
