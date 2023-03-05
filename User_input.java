/* 3. Write a Java program that asks the user to enter his/her name and 
greets them with “Hello <name>, have a good day” text. */
import java.util.Scanner;
public class User_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter your Name : ");
        String name = s.next();
        System.out.println("Hello " + name + ", have a good day");
        s.close();
        
    }
}
