package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;

public class Pyramid implements I3DShape {
    private double height;
    private Triangle face;
    private Square square;

    private final static Dimension SHAPE_DIMENSION = Dimension.THREE_DIMENSIONAL;

    public Pyramid(double base, double height) {
        this.square = new Square(base);
        this.height = height;
        this.face = new Triangle(base, calSlant());
    }

    private double calSlant() {
        double b = this.square.width;
        double h = this.height * this.height;
        double a = (b / 2.0) * (b / 2.0);
        return Math.sqrt(h + a);
    }

    @Override
    public double calArea() {
        double sides = 4.0 * face.calArea();
        double base = this.square.calArea();
        return sides + base;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

    @Override
    public double calVolume() {
        return square.calArea() * (height / 3.0);
    }
}
