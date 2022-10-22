package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;

public class Cuboid implements I3DShape {
    private double length;
    private double width;
    private double height;
    private Rectangle rectangleL;
    private Rectangle rectangleH;
    private Rectangle rectangleW;
    private static final Dimension SHAPE_DIMENSION = Dimension.THREE_DIMENSIONAL;

    public Cuboid(double length, double width, double height) {
        rectangleL = new Rectangle(length, width);
        rectangleH = new Rectangle(height, length);
        rectangleW = new Rectangle(width, height);

        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double calArea() {
        return 2.0 * (rectangleL.calArea() + rectangleH.calArea() + rectangleW.calArea());
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

    @Override
    public double calVolume() {
        return length * width * height;
    }
}
