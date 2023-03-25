import java.util.Scanner;

public class TernaryOperatorExample4_2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        
        String result = (num % 2 == 0) ? "even" : "odd";
        
        System.out.println(num + " is " + result);
        
        input.close();
    }
}
