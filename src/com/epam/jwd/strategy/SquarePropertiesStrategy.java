package com.epam.jwd.strategy;

public class SquarePropertiesStrategy implements FigurePropertiesStrategy {

    @Override
    public int getPerimeter(int... lengths) {
        return lengths[0] * 4;
    }

    @Override
    public double getArea(int... lengths) {
        return Math.pow(lengths[0], 2);
    }

}