package com.epam.jwd.model;

public class ChessFigure extends FigureAdditionalPossibility {

    public ChessFigure(Figure figure, FigureType figureType, FigureKind figureKind) {
        super(figure, figureType, figureKind);
    }

    @Override
    public void knightsMove() {
        System.out.println("knight's move");
    }
}
