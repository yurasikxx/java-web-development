package com.epam.jwd.strategy;

public class TrianglePropertiesStrategy implements FigurePropertiesStrategy {
    @Override
    public int getPerimeter(int... lengths) {
        return lengths[0] + lengths[1] + lengths[2];
    }

    @Override
    public double getArea(int... lengths) {
        return 0.5 * lengths[0] * lengths[1];
    }

}