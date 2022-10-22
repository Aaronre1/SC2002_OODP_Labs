package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;

public class Cone implements I3DShape {

    private Circle circle;
    private double height;

    private static final Dimension SHAPE_DIMENSION = Dimension.THREE_DIMENSIONAL;

    public Cone(double radius, double height) {
        this.circle = new Circle(radius);
        this.height = height;
    }

    @Override
    public double calArea() {
        double r = circle.getRadius();
        double h = height;
        return Math.PI * r * (r + Math.sqrt(h * h + r * r));
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

    @Override
    public double calVolume() {
        return Math.PI * (circle.getRadius() * circle.getRadius()) * (height / 3.0);
    }
}
