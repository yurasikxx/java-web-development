package com.epam.jwd.model;

import com.epam.jwd.strategy.SquarePropertiesStrategy;

public class Square extends Figure {

    private final Point pointA;
    private final Point pointB;
    private final Point pointC;
    private final Point pointD;

    Square(Point pointA, Point pointB, Point pointC, Point pointD) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
        this.pointD = pointD;
        this.figurePropertiesStrategy = new SquarePropertiesStrategy();
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

    public Point getPointD() {
        return pointD;
    }

    @Override
    public String toString() {
        return "Square{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                ", pointD=" + pointD +
                '}';
    }

}
