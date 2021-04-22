package com.epam.jwd.decorator;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;
import com.epam.jwd.validator.ChessFigurePostProcessor;
import com.epam.jwd.validator.FigurePostProcessor;

public class PostProcessingFactory extends FigureFactoryDecorator {

    private final FigurePostProcessor postProcessor = new ChessFigurePostProcessor();

    public PostProcessingFactory(FigureFactory figureFactory) {
        super(figureFactory);
    }

    @Override
    public Figure[] createFigure(FigureType type, FigureKind kind) throws FigureException {
        Figure[] figure = figureFactory.createFigure(type, kind);
        for (int i = 0; i < figure.length; i++) {
            figure[i] = postProcessor.figure(figure, type, kind);
        }
        return figure;
    }
}
