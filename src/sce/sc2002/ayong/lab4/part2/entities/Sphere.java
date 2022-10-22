package sce.sc2002.ayong.lab4.part2.entities;

import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;

public class Sphere implements I3DShape {
    private double radius;
    private static final Dimension SHAPE_DIMENSION = Dimension.THREE_DIMENSIONAL;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 4.0 * Math.PI * radius * radius;
    }

    @Override
    public Dimension getShapeType() {
        return SHAPE_DIMENSION;
    }

    @Override
    public double calVolume() {
        return (4.0 / 3.0) * Math.PI * (radius * radius * radius);
    }
}
