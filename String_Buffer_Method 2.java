public class String_Buffer_Method {


    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // Method 1: append()
        stringBuffer.append(" World!");
        System.out.println("Appended string: " + stringBuffer);

        // Method 2: insert()
        stringBuffer.insert(6, ", Java");
        System.out.println("Inserted string: " + stringBuffer);

        // Method 3: delete()
        stringBuffer.delete(0, 6);
        System.out.println("Deleted string: " + stringBuffer);

        // Method 4: reverse()
        stringBuffer.reverse();
        System.out.println("Reversed string: " + stringBuffer);
    }
}
