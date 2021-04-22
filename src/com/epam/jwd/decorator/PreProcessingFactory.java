package com.epam.jwd.decorator;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;
import com.epam.jwd.validator.FigurePreProcessor;

public class PreProcessingFactory extends FigureFactoryDecorator {

    private final FigurePreProcessor preProcessor = FigurePreProcessor.newInstance();
    private static final String FIGURE_MSG = "Figure %s has kind of issues";

    public PreProcessingFactory(FigureFactory figureFactory) {
        super(figureFactory);
    }

    @Override
    public Figure[] createFigure(FigureType type, FigureKind kind) throws FigureException {
        if (!preProcessor.valid(type, kind)) {
            throw new FigureException(String.format(FIGURE_MSG, kind));
        }
        return figureFactory.createFigure(type, kind);
    }
}
