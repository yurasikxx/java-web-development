package com.epam.jwd.model;

import com.epam.jwd.strategy.FigurePropertiesStrategy;

public class Figure {

    FigurePropertiesStrategy figurePropertiesStrategy;
    FigureKind figureKind;

    public int getPerimeter(int... lengths) {
        return figurePropertiesStrategy.getPerimeter(lengths[0], lengths[1], lengths[2]);
    }

    public double getArea(int... lengths) {
        return figurePropertiesStrategy.getArea(lengths[0], lengths[1]);
    }

    public FigureKind getFigureKind() {
        return figureKind;
    }

    public void knightsMove() {
        System.out.println("knight's move");
    }
}