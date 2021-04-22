package com.epam.jwd.model;

import com.epam.jwd.strategy.TrianglePropertiesStrategy;

import static java.lang.Math.random;

public class Triangle extends Figure {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final int height;

    private Triangle(Point pointA, Point pointB, Point pointC, int height) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.height = height;
        this.figurePropertiesStrategy = new TrianglePropertiesStrategy();
    }

    private static class TriangleHolder {
        private final static Triangle[] instance = new Triangle[2];
    }

    protected static Triangle[] getInstance() {
        for (int i = 0; i < TriangleHolder.instance.length; i++) {
            TriangleHolder.instance[i] = new Triangle(
                    new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10)),
                    (int) (random() * 10));
        }
        return TriangleHolder.instance;
    }

    public Point getPointA() {
        return pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }
}
