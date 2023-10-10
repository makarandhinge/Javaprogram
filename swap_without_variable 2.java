public class swap_without_variable {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
     
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("After Swaping a and b without third variable");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
