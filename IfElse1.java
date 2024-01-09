public class IfElse1 {
    public static String compareIfElse(int a, int b) {
        // Write your code here
        if (a > b) {
            return "greater";
        } else if (a < b) {
            return "smaller";
        } else {
            return "equal";
        }
    }

    public static void main(String[] args) {
        String s = compareIfElse(5, 5);
        System.out.println(s);
    }
}