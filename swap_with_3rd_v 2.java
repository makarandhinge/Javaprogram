public class swap_with_3rd_v {
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;
        int c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swaping a and b with third variable");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
