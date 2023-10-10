// 4. Write a Java program to convert Kilometers to miles.

import java.util.Scanner;
public class Kilo_to_Mile {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Convert Kilometer To Miles");
        System.out.println("Enter The Kilometer value");
        float kilo= s.nextFloat();
        double miles = kilo * 0.62137119;
        System.out.printf("%,.2f Miles",miles);
        s.close();
    }
}
