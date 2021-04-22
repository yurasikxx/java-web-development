package com.epam.jwd.model;

public class HourGlassFigure extends Figure {

    private final String name;

    public HourGlassFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private static class HourGlassFigureHolder {
        private final static HourGlassFigure[] instance = new HourGlassFigure[1];
    }

    protected static HourGlassFigure[] getInstance() {
        for (int i = 0; i < HourGlassFigure.HourGlassFigureHolder.instance.length; i++) {
            HourGlassFigure.HourGlassFigureHolder.instance[i] = new HourGlassFigure("\"Hourglass figure\"");
        }
        return HourGlassFigure.HourGlassFigureHolder.instance;
    }

    @Override
    public String toString() {
        return "HourGlassFigure{" +
                "name='" + name + '\'' +
                '}';
    }

}