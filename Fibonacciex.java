import java.util.Scanner;

public class Fibonacciex {

    public static int F(int n) {
        if (n <= 1) {
            return n;
        } else {
            return F(n - 1) + F(n - 2);
        }
    }

    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(F(n));

    }

}
