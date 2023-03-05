//  2. Write a program to calculate CGPA using marks of three subjects (out of 100)

/**
 * Find_CGPA
 */

 // Formula for CGPA is Percentage Divide by 9.5
public class Find_CGPA {

    public static void main(String[] args) {
        int phy = 95;
        int chem = 99;
        int maths = 75;
        int avg = (phy + chem + maths)/3;
        double cgpa = avg/9.5;
        // System.out.println(avg);
        System.out.printf(" The CGPA of the 3 Subject are %,.2f",cgpa);
    }
}