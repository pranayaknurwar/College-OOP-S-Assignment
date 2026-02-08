package Overriding;

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 6;

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape shape;

        shape = new Circle();
        System.out.println("Circle Area: " + shape.calculateArea());

        shape = new Rectangle();
        System.out.println("Rectangle Area: " + shape.calculateArea());
    }
}
