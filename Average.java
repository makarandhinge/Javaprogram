import java.util.*;

public class Average {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Check average of 5 number");
    System.out.println("Enter any 5 number");
    int a = sc.nextInt();      
    int b = sc.nextInt();  
    int c = sc.nextInt();  
    int d = sc.nextInt();  
    int e = sc.nextInt();
    int avg;
    avg = (a + b + c + d + e)/5;
    System.out.println("Average of given number is " + avg);   
    sc.close();
    }
    
}


