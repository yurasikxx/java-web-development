package com.epam.jwd.factory;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;

public interface FigureFactory {

    Figure[] createFigure(FigureType type, FigureKind kind) throws FigureException;

}
