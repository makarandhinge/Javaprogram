public class ExceptionEx_4 {
    static void divide() throws ArithmeticException
    {
        int x = 5/0;
    }

    public static void main(String[] args) {
       try{
        divide();
       }
       catch(ArithmeticException e)
       {
        System.out.println("Catch the Expression" + e);
       }
    }
}
