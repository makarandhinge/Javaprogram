import java.util.*;

public class Odd_Even
{


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for odd or even");
        int a = sc.nextInt();
        if((a%2)==0)
        {
            System.out.println("Value is Even");
        }
        else{
            System.out.println("Value is Odd");
        }
        sc.close();
    }
}
