package com.epam.jwd.service.implementation;

import com.epam.jwd.exception.FigureException;
import com.epam.jwd.model.Figure;
import com.epam.jwd.model.HourGlassFigure;
import com.epam.jwd.service.FigurePostProcessor;

public class FigureExistencePostProcessor implements FigurePostProcessor {

    @Override
    public void process(Figure figure) throws FigureException {
        if (figure instanceof HourGlassFigure) {
            throw new FigureException(String.format("Figure %s isn't geometrical figure", ((HourGlassFigure) figure)
                    .getName()));
        }
    }

}
