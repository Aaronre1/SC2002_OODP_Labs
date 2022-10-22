package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.IShape;

public class Rectangle implements IShape {

    private double width;
    private double height;

    private static final Dimension SHAPE_DIMENSION = Dimension.TWO_DIMENSIONAL;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calArea() {
        return width * height;
    }
    @Override
    public Dimension getShapeType() { return SHAPE_DIMENSION; }
}
