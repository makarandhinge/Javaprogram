/*
 Write a program to calculate the percentage of a given student in the
 CBSE board exam. His marks from 5 subjects must be taken
 as input from the keyboard. (Marks are out of 100)

 */

 import java.util.Scanner;
 class Cwh_Execrise_1_1{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks of CBSE board exam");
        System.out.print("Physic : ");
        float phy = s.nextFloat();
        System.out.print("Chemistry : ");
        float chem = s.nextFloat();
        System.out.print("Maths : ");
        float maths = s.nextFloat();
        System.out.print("Biology : ");
        float bio = s.nextFloat();
        System.out.print("Information Technolgy : ");
        float it = s.nextFloat();

        double avg = (phy + chem + bio + maths + it) / 5;
        System.out.printf("The percentage of CBSE board exam is %,.2f ",avg);
        s.close();
    }
 }