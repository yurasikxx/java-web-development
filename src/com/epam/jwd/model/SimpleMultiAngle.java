package com.epam.jwd.model;

public enum SimpleMultiAngle {
    INSTANCE;

    private static final MultiAngle[] MULTI_ANGLE = new MultiAngle[(int) (Math.random() * 5)];

    protected MultiAngle[] multiAngle() {
        for (int i = 0; i < MULTI_ANGLE.length; i++) {
            MULTI_ANGLE[i] = new MultiAngle((int) (Math.random() * 5));
        }
        return MULTI_ANGLE;
    }

    protected static SimpleMultiAngle getInstance() {
        return SimpleMultiAngle.INSTANCE;
    }
}
