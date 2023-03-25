public class TypeCastExample9_2 {
    public static void main(String[] args) {
        int i = 10;
        long l = (long) i; // Explicit type casting of int to long
        float f = (float) l; // Explicit type casting of long to float
        double d = (double) f; // Explicit type casting of float to double

        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
    }
}
