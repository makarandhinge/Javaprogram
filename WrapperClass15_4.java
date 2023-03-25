
public class WrapperClass15_4 {
    public static void main(String[] args) {
        int intValue = 123;

        // Converting int to Integer object
        Integer integerValue = Integer.valueOf(intValue);
        System.out.println("Integer value: " + integerValue);

        // Converting String to Integer object
        String stringValue = "456";
        Integer integerValueFromString = Integer.valueOf(stringValue);
        System.out.println("Integer value from string: " + integerValueFromString);

        // Converting Integer to String
        String stringValueFromInteger = integerValue.toString();
        System.out.println("String value from integer: " + stringValueFromInteger);

        // Converting Integer to int
        int intValueFromInteger = integerValue.intValue();
        System.out.println("Int value from integer: " + intValueFromInteger);

        // Parsing a String to an int
        int intValueFromString = Integer.parseInt("789");
        System.out.println("Int value from string: " + intValueFromString);

        // Converting Integer to binary, octal, and hexadecimal
        String binaryString = Integer.toBinaryString(intValue);
        String octalString = Integer.toOctalString(intValue);
        String hexString = Integer.toHexString(intValue);
        System.out.println("Binary string: " + binaryString);
        System.out.println("Octal string: " + octalString);
        System.out.println("Hexadecimal string: " + hexString);
    }
}
