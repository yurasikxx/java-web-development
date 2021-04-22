package com.epam.jwd.app;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.factory.ApplicationContext;
import com.epam.jwd.factory.FigureFactory;
import com.epam.jwd.model.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        FigureFactory figureFactory = ApplicationContext.newInstance();
        Figure[] figure;

        try {
            Point[] point = (Point[]) figureFactory.createFigure(FigureType.POINT, FigureKind.PLAIN);
            Line[] line = (Line[]) figureFactory.createFigure(FigureType.LINE, FigureKind.SPACE);
            Triangle[] triangle = (Triangle[]) figureFactory.createFigure(FigureType.TRIANGLE, FigureKind.PLAIN);
            Square[] square = (Square[]) figureFactory.createFigure(FigureType.SQUARE, FigureKind.PLAIN);
            MultiAngle[] multiAngle = (MultiAngle[]) figureFactory.createFigure(FigureType.MULTI_ANGLE, FigureKind.SPACE);
            HourGlassFigure[] hourGlassFigure = (HourGlassFigure[]) figureFactory.createFigure(FigureType
                    .HOUR_GLASS_FIGURE, FigureKind.SPACE);

            for (Triangle value : triangle) {
                LOGGER.info(value.getPerimeter(
                        value.getPointA().getLength(),
                        value.getPointB().getLength(),
                        value.getPointC().getLength()
                ));

                LOGGER.info(value.getArea(
                        value.getPointA().getLength(),
                        value.getHeight()
                ));
            }

            for (Square value : square) {
                LOGGER.info(value.getPerimeter(
                        value.getPointA().getLength(),
                        value.getPointB().getLength(),
                        value.getPointC().getLength()
                ));

                LOGGER.info(value.getArea(
                        value.getPointA().getLength(),
                        value.getPointB().getLength()
                ));
            }

            for (HourGlassFigure glassFigure : hourGlassFigure) {
                LOGGER.info(glassFigure.toString());
            }

            figure = figureFactory.createFigure(FigureType.SQUARE, FigureKind.SPACE);
            for (Figure item : figure) {
                item.knightsMove();
            }

        } catch (FigureException e) {
            LOGGER.error(e.getMessage());
        }
    }

}