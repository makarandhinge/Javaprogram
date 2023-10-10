
interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Area of Rectangle: " + rectangleArea);

        Circle circle = new Circle(3);
        double circleArea = circle.calculateArea();
        System.out.println("Area of Circle: " + circleArea);
    }
}

