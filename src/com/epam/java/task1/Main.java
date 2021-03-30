package com.epam.java.task1;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import static java.lang.Math.random;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void pointInput(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            points[i]= new Point((int) (random() * 10), (int) (random() * 10));
        }
    }

    public static void lineInput(Line[] lines) {
        for (int i = 0; i < lines.length; i++) {
            lines[i] = new Line(new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10)));
        }
    }

    public static void triangleInput(Triangle[] triangles) {
        for (int i = 0; i < triangles.length; i++) {
            triangles[i] = new Triangle(new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10)),
                    new Point((int) (random() * 10), (int) (random() * 10)));
        }
    }

    public static void squareInput(Square[] squares) {
        for (int i = 0; i < squares.length; i++) {
            squares[i] = new Square(new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2)),
                    new Point((int) (random() * 2), (int) (random() * 2)));
        }
    }

    public static void pointLog(Point[] points) {
        int j = 0;

        do {
            LOGGER.info(points[j].toString());
            j++;
        } while (j < points.length);
    }

    public static void samePointsOfLineCheck(Line[] lines) {
        for (Line line: lines) {
            if (line.getPointA().getPoint() != line.getPointB().getPoint()) {
                LOGGER.info(line.toString());
            } else {
                LOGGER.error("Object " + line.toString() + " isn't figure " + line.getClass().getName());
            }
        }
    }

    public static void samePointsOfTriangleCheck(Triangle[] triangles) {
        for (Triangle triangle: triangles) {
            if (triangle.getPointA().getPoint() == triangle.getPointB().getPoint() &&
                    triangle.getPointA().getPoint() == triangle.getPointC().getPoint()) {
                LOGGER.error("Object " + triangle.toString() + " isn't figure " + triangle.getClass().getName());
            } else {
                if (triangle.getPointA().getLength() + triangle.getPointB().getLength() > triangle.getPointC().getLength() &&
                        triangle.getPointA().getLength() + triangle.getPointC().getLength() > triangle.getPointB().getLength() &&
                        triangle.getPointC().getLength() + triangle.getPointB().getLength() > triangle.getPointA().getLength()) {
                    LOGGER.info(triangle.toString());
                } else {
                    LOGGER.error("Triangle " + triangle.toString() + " can't exist");
                }
            }
        }
    }

    public static void samePointsOfSquareCheck(Square[] squares) {
        for (Square square: squares) {
            if (square.getPointA().getPoint() == square.getPointB().getPoint() &&
                    square.getPointA().getPoint() == square.getPointC().getPoint() &&
                    square.getPointA().getPoint() == square.getPointD().getPoint()) {
                LOGGER.error("Object " + square.toString() + " isn't figure " + square.getClass().getName());
            } else {
                if (square.getPointA().getLength() == square.getPointB().getLength() &&
                        square.getPointA().getLength() == square.getPointC().getLength() &&
                        square.getPointA().getLength() == square.getPointD().getLength()) {
                    LOGGER.info(square.toString());
                } else {
                    LOGGER.error("Object " + square.toString() + " isn't square");
                }
            }
        }
    }


    public static void main(String[] args) {

        Point[] points = new Point[4];
        pointInput(points);

        Line[] lines = new Line[2];
        lineInput(lines);

        Triangle[] triangles = new Triangle[2];
        triangleInput(triangles);

        Square[] squares = new Square[1];
        squareInput(squares);

        pointLog(points);


        samePointsOfLineCheck(lines);
        samePointsOfTriangleCheck(triangles);
        samePointsOfSquareCheck(squares);

    }
}
