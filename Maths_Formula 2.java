import java.util.*;


class Maths_Formula
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter below any option");
        System.out.println("1 : Area of circle");
        System.out.println("2 : Area of triangle");
        int c = sc.nextInt();
       switch (c) { 
        case 1:
             circle();
            break;
       
        default:
            triangle();
            break;
       }
    }
    static void circle()
    {
        System.out.println("Enter a radius :");
        float r = sc.nextFloat();
        float ac = 3.14f * (r * r);
        System.out.println("Area of circle is " + ac);

        
    }
    static void triangle()
    {
        System.out.println("Enter height ");
        float h =sc.nextFloat();
        System.out.println("Enter base ");
        float b = sc.nextFloat();
        float at = 0.5f * h * b;
        System.out.println("Area of triange is" + at);


    }
}