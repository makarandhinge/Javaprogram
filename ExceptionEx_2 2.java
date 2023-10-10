public class ExceptionEx_2 {
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.println("Rest of the code in try block");
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
