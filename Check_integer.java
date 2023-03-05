/* 5. Write a Java program to detect whether a number entered by the user is an 
integer or not.
 */

 import java.util.Scanner;
 class Check_integer{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Check Wheather Entered number is integer or not");
        System.out.println("Enter a Number");
        boolean a = s.hasNextInt();
        if(a == true)
        {
            System.out.println("The entered number is Integer");
        }
        else
        {
            System.out.println("The entered number is Not Integer");
        }
        s.close();
    }
 }