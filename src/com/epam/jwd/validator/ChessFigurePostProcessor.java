package com.epam.jwd.validator;

import com.epam.jwd.model.ChessFigure;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;

public class ChessFigurePostProcessor implements FigurePostProcessor {
    @Override
    public Figure figure(Figure[] figure, FigureType type, FigureKind kind) {
        for (Figure value : figure) {
            if (FigureKind.SPACE.equals(value.getFigureKind())) {
                return new ChessFigure(value, type, kind);
            }
        }
        return figure[0];
    }
}
