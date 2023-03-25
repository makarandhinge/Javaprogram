public class StringClassExample11_1{
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "Java Programming";
        String str3 = "   Spaces before and after    ";

        // Length method
        System.out.println("Length of str1: " + str1.length());

        // CharAt method
        System.out.println("Character at position 6 in str1: " + str1.charAt(6));

        // Concat method
        System.out.println("Concatenation of str1 and str2: " + str1.concat(str2));

        // Equals method
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // EqualsIgnoreCase method
        System.out.println("str1 equalsIgnoreCase str2? " + str1.equalsIgnoreCase(str2));

        // Substring method
        System.out.println("Substring of str2 from index 2 to 7: " + str2.substring(2, 7));

        // IndexOf method
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));

        // LastIndexOf method
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

        // Replace method
        System.out.println("Replace 'l' with 'z' in str1: " + str1.replace('l', 'z'));

        // ToLowerCase method
        System.out.println("Lowercase of str2: " + str2.toLowerCase());

        // ToUpperCase method
        System.out.println("Uppercase of str1: " + str1.toUpperCase());

        // Trim method
        System.out.println("Trimmed version of str3: " + str3.trim());

        // Split method
        String[] words = str2.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // Starts with method
        System.out.println("Does str1 start with 'He'? " + str1.startsWith("He"));

        // Ends with method
        System.out.println("Does str2 end with 'ing'? " + str2.endsWith("ing"));

        // Contains method
        System.out.println("Does str2 contain 'Prog'? " + str2.contains("Prog"));

        // ValueOf method
        int num = 42;
        String strNum = String.valueOf(num);
        System.out.println("Value of num as a string: " + strNum);
    }
}
