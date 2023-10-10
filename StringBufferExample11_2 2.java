public class StringBufferExample11_2 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Hello World");
        StringBuffer sb2 = new StringBuffer("Java Programming");
        
        // append method
        sb1.append("!!!");
        System.out.println("sb1 after append: " + sb1);
        
        // insert method
        sb2.insert(5, " is a great ");
        System.out.println("sb2 after insert: " + sb2);
        
        // delete method
        sb1.delete(5, 11);
        System.out.println("sb1 after delete: " + sb1);
        
        // reverse method
        sb2.reverse();
        System.out.println("sb2 after reverse: " + sb2);
        
        // capacity method
        System.out.println("sb1 capacity: " + sb1.capacity());
        
        // ensureCapacity method
        sb1.ensureCapacity(20);
        System.out.println("sb1 after ensureCapacity: " + sb1);
        
        // charAt method
        System.out.println("Character at index 2 in sb2: " + sb2.charAt(2));
        
        // setCharAt method
        sb1.setCharAt(0, 'h');
        System.out.println("sb1 after setCharAt: " + sb1);
        
        // getChars method
        char[] chars = new char[5];
        sb2.getChars(0, 5, chars, 0);
        System.out.println("Characters in sb2 from index 0 to 5: " + new String(chars));
        
        // indexOf method
        System.out.println("Index of 'l' in sb1: " + sb1.indexOf("l"));
        
        // lastIndexOf method
        System.out.println("Last index of 'a' in sb2: " + sb2.lastIndexOf("a"));
        
        // replace method
        sb1.replace(0, 5, "Hi");
        System.out.println("sb1 after replace: " + sb1);
        
        // substring method
        System.out.println("Substring of sb2 from index 5 to 11: " + sb2.substring(5, 11));
        
        // length method
        System.out.println("Length of sb1: " + sb1.length());
        
        // setLength method
        sb1.setLength(2);
        System.out.println("sb1 after setLength: " + sb1);
        
        // toString method
        String str = sb2.toString();
        System.out.println("sb2 as a string: " + str);
    }
}
