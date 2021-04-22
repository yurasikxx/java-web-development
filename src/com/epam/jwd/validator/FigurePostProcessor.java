package com.epam.jwd.validator;

import com.epam.jwd.model.Figure;
import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;

public interface FigurePostProcessor {
    Figure figure(Figure[] figure, FigureType type, FigureKind kind);
}
