package com.epam.jwd.model;

public class MultiAngle extends Figure {

    private final int angleAmount;

    MultiAngle(int angleAmount) {
        this.angleAmount = angleAmount;
    }

    public int getAngleAmount() {
        return angleAmount;
    }

    @Override
    public String toString() {
        return "MultiAngle{" +
                "angleAmount=" + angleAmount +
                '}';
    }
}
