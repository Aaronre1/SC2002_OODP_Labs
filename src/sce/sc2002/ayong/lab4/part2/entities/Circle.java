package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.IShape;

public class Circle implements IShape {
    private double radius;
    private static final Dimension SHAPE_DIMENSION = Dimension.TWO_DIMENSIONAL;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {return radius;}
    @Override
    public double calArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }
}
