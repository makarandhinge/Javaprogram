import java.util.*;

public class SwitchCase4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        
        switch(ch) {
            case 'a':
            case 'A':
                System.out.println("You entered A");
                break;
            case 'b':
            case 'B':
                System.out.println("You entered B");
                break;
            case 'c':
            case 'C':
                System.out.println("You entered C");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        input.close();
    }
    
}
