public class TypeCastExample7_2 {
    public static void main(String[] args) {
        byte a = 10;
        int b = a; // Implicit typecasting of byte to int
        long c = b; // Implicit typecasting of int to long
        float d = c; // Implicit typecasting of long to float
        double e = d; // Implicit typecasting of float to double

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
        System.out.println("e: " + e);
    }
}
