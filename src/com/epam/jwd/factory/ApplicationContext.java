package com.epam.jwd.factory;

import com.epam.jwd.decorator.PostProcessingFactory;
import com.epam.jwd.decorator.PreProcessingFactory;
import com.epam.jwd.model.SimpleFigureFactory;

public interface ApplicationContext {

    static FigureFactory newInstance() {
        return new PostProcessingFactory(new PreProcessingFactory(SimpleFigureFactory.INSTANCE));
    }

}
