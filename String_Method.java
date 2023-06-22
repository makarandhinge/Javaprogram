public class String_Method {


    public static void main(String[] args) {
        String str = "Hello, World!";


        int length = str.length();
        System.out.println("Length of the string: " + length);


        char character = str.charAt(7);
        System.out.println("Character at index 7: " + character);


        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + substring);


        int index = str.indexOf('o');
        System.out.println("Index of 'o': " + index);
    }
}
