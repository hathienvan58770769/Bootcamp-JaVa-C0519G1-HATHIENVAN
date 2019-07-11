package baitap3;

import baitap2.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(3f, 4f);
        System.out.println(point2D);
    }
}
