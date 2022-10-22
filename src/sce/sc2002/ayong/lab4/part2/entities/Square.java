package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.IShape;

public class Square implements IShape {
    double width;
    private static final Dimension SHAPE_DIMENSION = Dimension.TWO_DIMENSIONAL;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double calArea() {
        return width * width;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }
}
