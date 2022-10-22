package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;

public class Cylinder implements I3DShape {
    private Circle circle;
    private Rectangle rectangle;
    private static final Dimension SHAPE_DIMENSION = Dimension.THREE_DIMENSIONAL;

    public Cylinder(double radius, double height) {
        this.circle = new Circle(radius);
        this.rectangle = new Rectangle(this.circle.getCircumference(), height);
    }

    @Override
    public double calArea() {
        return rectangle.calArea() + 2.0 * circle.calArea();
    }

    @Override
    public double calVolume() {
        double r = circle.getRadius();
        double h = rectangle.getHeight();
        return Math.PI * (r * r) * h;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

}
