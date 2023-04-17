import java.util.*;

public class Pattern {


    void star_01_pattern(int n){

        for (int rows = 1; rows <= n; rows++) {
            for (int col = 1; col <= rows ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        Pattern p = new Pattern();
        System.out.println("Enter nth value below");
        n = sc.nextInt();
        p.star_01_pattern(n);
        p.star_02_pattern(n);
        p.star_03_pattern(n);

    }

    void star_02_pattern(int n){

        for (int rows = n; rows >= 1 ; rows--) {
            for (int col = rows; col >= 1 ; col--) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();
    }

    void star_03_pattern(int n){
        int m = 1;
        int k = n - 1;
        for (int rows = 1; rows <= n ; rows++) {
            for (int col = 1; col <= k ; col++) {
                System.out.print("  ");

            }
            for (int star = 1; star <= m ; star++) {
                System.out.print("* ");
            }
            m = m + 2;
            k = k - 1;
            System.out.println();



        }
    }
}
