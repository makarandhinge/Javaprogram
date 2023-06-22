

public class Exception_Handling{
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Trying to access an element out of bounds
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds exception occurred!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}

