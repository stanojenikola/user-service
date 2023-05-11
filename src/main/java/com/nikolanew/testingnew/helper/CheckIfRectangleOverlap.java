package com.nikolanew.testingnew.helper;

public class CheckIfRectangleOverlap {

    private static Point topLeft;
    private static Point bottomRight;

    public CheckIfRectangleOverlap(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }


    public boolean isOverlapping(CheckIfRectangleOverlap rectangle) {

        if (this.topLeft.x > rectangle.bottomRight.x // R1 is right to R2
            || this.bottomRight.x < rectangle.topLeft.x // R1 is left to R2
            || this.topLeft.y < rectangle.bottomRight.y // R1 is above R2
            || this.bottomRight.y > rectangle.topLeft.y) { // R1 is below R1
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);

        CheckIfRectangleOverlap first = new CheckIfRectangleOverlap(l1,r1);
        CheckIfRectangleOverlap second = new CheckIfRectangleOverlap(l2,r2);

        if(first.isOverlapping(second)) {
            System.out.println("is overlapping");
        } else {
            System.out.println("no");

        }
    }


}

class Point {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
