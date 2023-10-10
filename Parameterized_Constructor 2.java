public class Parameterized_Constructor {
    private double length;
    private double width;

    public Parameterized_Constructor(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        Parameterized_Constructor rectangle = new Parameterized_Constructor(5.0, 3.0);


        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();


        System.out.println("Rectangle dimensions:");
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

