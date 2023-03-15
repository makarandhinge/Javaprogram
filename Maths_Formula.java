import java.util.*;


class Maths_Formula
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
    }
    void circle()
    {
        System.out.println("Enter a radius :");
        float r = sc.nextFloat();
        float ac = 3.14f * (r * r);
        System.out.println("Area of circle is " + ac);

        
    }
    void triangle()
    {
        System.out.println("Enter height ");
        float h =sc.nextFloat();
        System.out.println("Enter base ");
        float b = sc.nextFloat();
        float at = 0.5f * h * b;
        System.out.println("Area of triange is" + at);


    }
}