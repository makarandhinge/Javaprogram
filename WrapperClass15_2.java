public class WrapperClass15_2 {
    public static void main(String[] args) {
        char ch = 'a';

        // isDigit() method - checks if the character is a digit
        boolean isDigit = Character.isDigit(ch);
        System.out.println("Is " + ch + " a digit? " + isDigit);

        // isLetter() method - checks if the character is a letter
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is " + ch + " a letter? " + isLetter);

        // toUpperCase() method - converts the character to upper case
        char upperCaseChar = Character.toUpperCase(ch);
        System.out.println("Uppercase of " + ch + " is " + upperCaseChar);

        // toLowerCase() method - converts the character to lower case
        char lowerCaseChar = Character.toLowerCase(ch);
        System.out.println("Lowercase of " + ch + " is " + lowerCaseChar);
    }
}
