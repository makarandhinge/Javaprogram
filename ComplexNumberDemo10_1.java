class Complex {
    double real;
    double imaginary;

    // Default constructor
    public Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized constructor
    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy constructor
    public Complex(Complex c) {
        real = c.real;
        imaginary = c.imaginary;
    }

    // Method to add two complex numbers
    public Complex add(Complex c) {
        Complex result = new Complex();
        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;
        return result;
    }

    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

public class ComplexNumberDemo10_1 {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 3);
        Complex c2 = new Complex(4, 5);
        Complex c3 = new Complex(c1);
        Complex c4 = new Complex();

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);

        Complex sum1 = c1.add(c2);
        Complex sum2 = c1.add(c3);

        System.out.println("Sum of c1 and c2: " + sum1);
        System.out.println("Sum of c1 and c3: " + sum2);
    }
}



