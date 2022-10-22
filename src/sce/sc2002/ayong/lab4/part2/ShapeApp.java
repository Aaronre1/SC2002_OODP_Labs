package sce.sc2002.ayong.lab4.part2;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;
import sce.sc2002.ayong.lab4.part2.common.Dimension;
import sce.sc2002.ayong.lab4.part2.common.I3DShape;
import sce.sc2002.ayong.lab4.part2.common.IShape;
import sce.sc2002.ayong.lab4.part2.entities.*;

public class ShapeApp {
    private static IUserInput userInput;

    public ShapeApp(IUserInput input) {
        userInput = input;
    }

    public static void main(String[] args) {
        if (userInput == null) {
            userInput = new UserInput();
        }
        int numberOfShapes;
        Print("Please enter # of shapes: ");
        numberOfShapes = userInput.nextInt();

        for (int i = 0; i < numberOfShapes; i++) {
            IShape shape = PromptShape();
            PromptCalculate(shape);
        }
        userInput.close();
    }

    private static IShape PromptShape() {
        int choice;
        //PrintShapeOptions();
        PrintShapeOptionsMin();
        do {
            choice = userInput.nextInt();
            Println("------------------------------");
            switch (choice) {
                case 1:
                    return getSquare();
                case 2:
                    return getRectangle();
                case 3:
                    return getCircle();
                case 4:
                    return getTriangle();
                case 5:
                    return getSphere();
                case 6:
                    return getPyramid();
                case 7:
                    return getCuboid();
                case 8:
                    return getCone();
                case 9:
                    return getCylinder();
                default:
                    Println("Please select a valid option");
            }
        } while (true);
    }

    private static void PrintShapeOptions() {
        Println("[ 2D Shapes ]");
        Println("1: Square");
        Println("2: Rectangle");
        Println("3: Circle");
        Println("4: Triangle");
        Println("[ 3D Shapes ]");
        Println("5: Sphere");
        Println("6: Square Pyramid");
        Println("7: Cuboid");
        Println("8: Cone");
        Println("9: Cylinder");
        Print("Please select a shape: ");
    }

    private static void PrintShapeOptionsMin() {
        Println("Please select a shape:");
        Println("[ 2D Shapes ] 1.Square | 2.Rectangle | 3.Circle | 4.Triangle ");
        Println("[ 3D Shapes ] 5.Sphere | 6.Square Pyramid | 7.Cuboid | 8.Cone | 9.Cylinder");
    }

    private static void PromptCalculate(IShape shape) {
        if (shape.getShapeType() == Dimension.THREE_DIMENSIONAL) {
            PromptCalculate3D((I3DShape) shape);
        } else {
            PromptCalculate2D(shape);
        }
        Println("------------------------------");
    }

    private static void PromptCalculate2D(IShape shape) {
        Println("[ Calculate ] 1.Total Area | 2.Done");
        int choice;
        do {
            choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    Println("Total Area is : " + shape.calArea());
                    break;
                case 2:
                    return;
                default:
                    Println("Please select a valid option");
            }
        } while (true);
    }

    private static void PromptCalculate3D(I3DShape shape) {
        Println("[ Calculate ] 1. Total Area | 2. Volume | 3. Done");
        int choice;
        do {
            choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    Println("Total Area is : " + shape.calArea());
                    break;
                case 2:
                    Println("Total Volume is : " + shape.calVolume());
                    break;
                case 3:
                    return;
                default:
                    Println("Please select a valid option");
            }
        } while (true);
    }

    private static Square getSquare() {
        Println("[ Square ]");
        Print("Width: ");
        double width = userInput.nextDouble();
        return new Square(width);
    }

    private static Rectangle getRectangle() {
        Println("[ Rectangle ]");
        Print("Width:");
        double width = userInput.nextDouble();
        Print("Height:");
        double height = userInput.nextDouble();
        return new Rectangle(width, height);
    }

    private static Circle getCircle() {
        Println("[ Circle ]");
        Print("Radius: ");
        double radius = userInput.nextDouble();
        return new Circle(radius);
    }

    private static Triangle getTriangle() {
        Println("[ Triangle ]");
        Print("Base: ");
        double base = userInput.nextDouble();
        Print("Height: ");
        double height = userInput.nextDouble();

        return new Triangle(base, height);
    }


    private static Sphere getSphere() {
        Println("[ Sphere ]");
        Print("Radius: ");
        double radius = userInput.nextDouble();
        return new Sphere(radius);
    }

    private static Pyramid getPyramid() {
        Println("[ Square Pyramid ]");
        Print("Base: ");
        double base = userInput.nextDouble();
        Print("Height: ");
        double height = userInput.nextDouble();
        return new Pyramid(base, height);
    }

    private static Cuboid getCuboid() {
        Println("[ Cuboid ]");
        Print("Length: ");
        double length = userInput.nextDouble();
        Print("Width: ");
        double width = userInput.nextDouble();
        Print("Height: ");
        double height = userInput.nextDouble();
        return new Cuboid(length, width, height);
    }

    private static Cone getCone() {
        Println("[ Cone ]");
        Print("Radius: ");
        double radius = userInput.nextDouble();
        Print("Height: ");
        double height = userInput.nextDouble();
        return new Cone(radius, height);
    }

    private static Cylinder getCylinder() {
        Println("[ Cylinder ]");
        Print("Radius: ");
        double radius = userInput.nextDouble();
        Print("Height: ");
        double height = userInput.nextDouble();
        return new Cylinder(radius, height);
    }


    private static void Println(String message) {
        System.out.println(message);
    }

    private static void Print(String message) {
        System.out.print(message);
    }

}
