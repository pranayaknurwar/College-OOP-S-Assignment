package Abstract_Classes;

abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class sample01 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        System.out.println("Area: " + s.calculateArea());
    }
}