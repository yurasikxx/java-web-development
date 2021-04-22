package com.epam.jwd.model;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.exception.FigureNotExistException;
import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.service.implementation.FigureExistencePostProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum SimpleFigureFactory implements FigureFactory {
    INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger(SimpleFigureFactory.class);
    private static final String FIGURE_NOT_EXIST_MSG = "Figure %s doesn't exist";
    private final FigureExistencePostProcessor figureExistencePostProcessor = new FigureExistencePostProcessor();

    @Override
    public Figure[] createFigure(FigureType type, FigureKind figureKind) throws FigureException {

        Figure[] figure;

        switch (type) {
            case POINT:
                figure = Point.getInstance();
                break;
            case LINE:
                figure = Line.getInstance();
                break;
            case TRIANGLE:
                figure = Triangle.getInstance();
                break;
            case SQUARE:
                figure = SimpleSquare.getInstance().square();
                break;
            case MULTI_ANGLE:
                figure = SimpleMultiAngle.getInstance().multiAngle();
                break;
            case HOUR_GLASS_FIGURE:
                figure = HourGlassFigure.getInstance();
                break;
            default:
                throw new FigureNotExistException(String.format(FIGURE_NOT_EXIST_MSG, type));
        }

        try {
            for (Figure value : figure) {
                figureExistencePostProcessor.process(value);
            }
        } catch (FigureException e) {
            LOGGER.error(e.getMessage());
        }

        return figure;

    }

}