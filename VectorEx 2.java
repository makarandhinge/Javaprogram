import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Method 1: add()
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        System.out.println("Vector elements: " + vector);

        // Method 2: size()
        int size = vector.size();
        System.out.println("Size of the vector: " + size);

        // Method 3: get()
        String element = vector.get(1);
        System.out.println("Element at index 1: " + element);

        // Method 4: remove()
        String removedElement = vector.remove(2);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated vector: " + vector);
    }
}
