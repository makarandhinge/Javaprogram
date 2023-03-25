public class TypeCastExample7_1 {
    public static void main(String[] args) {
        int x = 10;
        long y = x; // Implicit typecasting of int to long
        float z = y; // Implicit typecasting of long to float

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
