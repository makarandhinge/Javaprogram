import java.util.*;


public class EAndO3_1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int a = sc.nextInt();
        if(a%2 == 0)
        {
            System.out.println("Entered numner is even");
        }    
        else{
            System.out.println("Entered number is odd");
        }
        sc.close();
    }
    
}
