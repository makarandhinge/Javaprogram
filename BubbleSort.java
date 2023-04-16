import java.util.Scanner;


public class BubbleSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter an array size");
        n = sc.nextInt();
        System.out.println("Enter " + n + " Element in array");

        int []arr = new int[n];

       // for(int i:arr)
       for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before using Bubble Sort");
        for(int i:arr)
        {
            System.out.println(i);
        }
        for(int j=0;j>arr.length;j++)
        {
            for(int i=arr.length-1;i>=0;i--)
            {
                if(arr[i]<arr[i-1])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = arr[i];

                }
            }
        }

        System.out.println("After using Bubble Sort");
        for(int i:arr)
        {
            System.out.println(i);
        }
        sc.close();

    }
    
}
