package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.IShape;

public class Triangle implements IShape {
    private double base;
    private double height;

    private static final Dimension SHAPE_DIMENSION = Dimension.TWO_DIMENSIONAL;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calArea() {
        return base * height / 2;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

}
