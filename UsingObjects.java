import java.util.Scanner;
class Add
{
   int addition = 0;
   Add(int number1, int number2)
   {
      addition = number1 + number2;
   }
}
public class UsingObjects
{
   public static void main(String[] args)
   {
      int num1, num2;
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter first number: ");
      num1 = sc.nextInt();
      System.out.println("Please enter first number: ");
      num2 = sc.nextInt();
      Add obj = new Add(num1, num2);
      System.out.println("Addition of two numbers in java using objects: " + obj.addition);
      sc.close();
   }
}

