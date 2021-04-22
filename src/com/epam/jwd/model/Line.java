package com.epam.jwd.model;

import static java.lang.Math.random;

public class Line extends Figure {

    private static final Line[] instance = new Line[2];
    private final Point pointA;
    private final Point pointB;

    private Line(Point pointA, Point pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
    }

    protected static Line[] getInstance() {
        for (int i = 0; i < instance.length; i++) {
            instance[i] = new Line(
                    new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10))
            );
        }
        return instance;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    @Override
    public String toString() {
        return "Line{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                '}';
    }

}