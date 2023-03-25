import java.util.Vector;

public class VectorExample14_ {
    public static void main(String[] args) {
        // Creating a Vector
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector using add() method
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Grape");
        vector.add("Pineapple");

        // Displaying the Vector using toString() method
        System.out.println("Vector elements: " + vector.toString());

        // Accessing an element in the Vector using get() method
        String element = vector.get(3);
        System.out.println("Element at index 3: " + element);

        // Changing an element in the Vector using set() method
        vector.set(1, "Mango");
        System.out.println("Vector after setting element at index 1 to Mango: " + vector.toString());

        // Removing an element from the Vector using remove() method
        vector.remove(4);
        System.out.println("Vector after removing element at index 4: " + vector.toString());

        // Checking if an element exists in the Vector using contains() method
        boolean contains = vector.contains("Apple");
        System.out.println("Vector contains 'Apple': " + contains);

        // Checking if the Vector is empty using isEmpty() method
        boolean empty = vector.isEmpty();
        System.out.println("Is the Vector empty? " + empty);

        // Getting the index of an element using indexOf() method
        int index = vector.indexOf("Orange");
        System.out.println("Index of 'Orange': " + index);

        // Getting the last index of an element using lastIndexOf() method
        int lastIndex = vector.lastIndexOf("Mango");
        System.out.println("Last index of 'Mango': " + lastIndex);

        // Getting the size of the Vector using size() method
        int size = vector.size();
        System.out.println("Size of Vector: " + size);

        // Creating a new Vector and copying the elements from the original Vector using copyInto() method
        // Vector<String> newVector = new Vector<>();
        // vector.copyInto(newVector);
        // System.out.println("New Vector after copying elements from original Vector: " + newVector.toString());

        // Adding all elements of a collection to the Vector using addAll() method
        Vector<String> fruits = new Vector<>();
        fruits.add("Kiwi");
        fruits.add("Papaya");
        fruits.add("Dragonfruit");
        vector.addAll(fruits);
        System.out.println("Vector after adding all fruits: " + vector.toString());

        // Clearing the Vector using clear() method
        vector.clear();
        System.out.println("Vector after clearing: " + vector.toString());

        // Creating a Vector with initial capacity using constructor
        Vector<Integer> integerVector = new Vector<>(10);

        // Adding elements to the Vector using addElement() method
        integerVector.addElement(1);
        integerVector.addElement(2);
        integerVector.addElement(3);

        // Displaying the Vector using toString() method
        System.out.println("Integer Vector elements: " + integerVector.toString());

        // Cloning the Vector using clone() method
        Vector<Integer> clonedVector = (Vector<Integer>) integerVector.clone();
        System.out.println("Cloned Integer Vector: " + clonedVector.toString());

        
    }
}
