package com.epam.jwd.decorator;

import com.epam.jwd.factory.FigureFactory;

public abstract class FigureFactoryDecorator implements FigureFactory {

    FigureFactory figureFactory;

    public FigureFactoryDecorator(FigureFactory figureFactory) {
        this.figureFactory = figureFactory;
    }

}
