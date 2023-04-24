package com.example.javaproject2.week1.day5;

public class PointTest {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.x = 0;
        p1.y = 0;
        System.out.printf("x:%d, y:%d\n",p1.x, p1.y);

        Point p2 = new Point();
        p2.x = 1;
        p2.y = 1;
        System.out.printf("x:%d, y:%d\n",p2.x, p2.y);

        Point p3 = new Point();
        p3.x = 3;
        p3.y = 2;
        System.out.printf("x와 y가 같은지? %s\n", p3.isSameXy());

        double dP2ToP3 = p2.getDistance(p3);
        System.out.printf("%f", dP2ToP3);

    }
}
