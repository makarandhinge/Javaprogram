public class WrapperClass15_1 {
    public static void main(String[] args) {
        // Creating a String value
        String str = "1234";

        // Converting the String value to an Integer using Integer.parseInt() method
        int intValue = Integer.parseInt(str);

        // Converting the Integer value to an Integer wrapper class object using Integer.valueOf() method
        Integer integerValue = Integer.valueOf(intValue);

        // Displaying the String, Integer, and Integer wrapper class object
        System.out.println("String value: " + str);
        System.out.println("Integer value: " + intValue);
        System.out.println("Integer wrapper class object: " + integerValue);
    }
}
