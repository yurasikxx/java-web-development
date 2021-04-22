package com.epam.jwd.model;

import static java.lang.Math.random;

public class Point extends Figure {

    private static Point[] instance;
    private final int point;
    private final int length;

    Point(int point, int length) {
        this.point = point;
        this.length = length;
    }

    protected static Point[] getInstance() {
        if (instance == null) {
            instance = new Point[4];
        }
        for (int i = 0; i < instance.length; i++) {
            instance[i] = new Point((int) (random() * 10), (int) (random() * 10));
        }
        return instance;
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