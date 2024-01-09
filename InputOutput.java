import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        System.out.println("Enter the value");
        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(1);
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}