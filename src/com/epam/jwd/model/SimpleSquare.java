package com.epam.jwd.model;

import static java.lang.Math.random;

public enum SimpleSquare {
    INSTANCE;

    private static final Square[] SQUARE = new Square[1];

    protected Square[] square() {
        for (int i = 0; i < SQUARE.length; i++) {
            SQUARE[i] = new Square(
                    new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2))
            );
        }
        return SQUARE;
    }

    protected static SimpleSquare getInstance() {
        return SimpleSquare.INSTANCE;
    }
}
