public class CommandLineArgumentsExample5_2
 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }
}
