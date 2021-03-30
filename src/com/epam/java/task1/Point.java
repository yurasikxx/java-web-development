package com.epam.java.task1;

public class Point {

    private final int point;
    private final int length;

    public Point(int point, int length) {
        this.point = point;
        this.length = length;
    }

    public int getPoint() {
        return point;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Point{" +
                "point=" + point +
                ", length=" + length +
                '}';
    }
}