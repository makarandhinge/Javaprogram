// Write a Java program to take three numbers
// from the user and print the greatest number

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Greatest_no {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Find Greatest number");
        System.out.println("Enter a 1st value ");
        float a = s.nextFloat();
        System.out.println("Enter a 2nd value ");
        float b = s.nextFloat();
        System.out.println("Enter a 3rd value ");
        float c = s.nextFloat();
        if(a>b && a>c)
        {
            System.out.println("1st value is Greatest number");
        }
        else if(b>a && b>c)
        {
            System.out.println("2nd value is Greatest number");
        }
        else
        {
            System.out.println("3rd value is Greatest number");
        }
        s.close();
        }
    }

