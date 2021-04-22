package com.epam.jwd.validator;

import com.epam.jwd.model.FigureKind;
import com.epam.jwd.model.FigureType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum FigureValidator implements FigurePreProcessor {
    INSTANCE;

    private static final Logger LOGGER = LogManager.getLogger(FigureValidator.class);

    @Override
    public boolean valid(FigureType figureType, FigureKind figureKind) {

        switch (figureType) {
            case POINT:
            case LINE:
            case TRIANGLE:
            case SQUARE:
                if (figureKind != null) {
                    LOGGER.info("Figure kind is correct");
                    return true;
                }
            case MULTI_ANGLE:
            case HOUR_GLASS_FIGURE:
                if (FigureKind.SPACE.equals(figureKind)) {
                    LOGGER.info("Figure kind is correct");
                    return true;
                }
        }

        LOGGER.error("Kind of figure issue! Type: " + figureType + " Kind: " + figureKind);
        return false;
    }
}
