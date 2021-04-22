package com.epam.jwd.model;

public abstract class FigureAdditionalPossibility extends Figure {

    private final Figure figure;
    private final FigureType figureType;
    private final FigureKind figureKind;

    protected FigureAdditionalPossibility(Figure figure, FigureType figureType, FigureKind figureKind) {
        this.figure = figure;
        this.figureType = figureType;
        this.figureKind = figureKind;
    }

    public Figure getFigure() {
        return figure;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public FigureKind getFigureKind() {
        return figureKind;
    }
}
