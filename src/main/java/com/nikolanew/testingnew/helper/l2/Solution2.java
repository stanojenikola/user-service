package com.nikolanew.testingnew.helper.l2;

public class Solution2 {

    public static void main(String args[]) throws Exception {
        /*try{
            Class c=Class.forName("Permutations");
            Permutations s=(Permutations)c.newInstance();
            s.subsets(new int[] {1,2,3});
        }catch(Exception e){System.out.println(e);}*/
        String osName = System.getProperty("os.name").toLowerCase();
        long nanoTime = System.nanoTime();

        System.out.println(osName);
        System.out.println(nanoTime);

        /*var i = 201;
        Integer j = new Integer(201);
        if(i == j)
        {
            System.out.println("hello");
        }
        else
        {
            System.out.println("bye");
        }
*/
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public static int binarySearch(int[] a, int beg, int end, int item) {
        int mid;
        if (end >= beg) {
            mid = (beg + end) / 2;
            if (a[mid] == item) {
                return mid + 1;
            } else if (a[mid] < item) {
                return binarySearch(a, mid + 1, end, item);
            } else {
                return binarySearch(a, beg, mid - 1, item);
            }
        }
        return -1;
    }

}


class Test2 {

    void print() {
        System.out.println("test reflection - access at runtime");
    }
}