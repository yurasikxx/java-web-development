package com.epam.jwd.validator;

import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;

public interface FigurePreProcessor {

    boolean valid(FigureType figureType, FigureKind figureKind);

    static FigurePreProcessor newInstance() {
        return FigureValidator.INSTANCE;
    }

}
