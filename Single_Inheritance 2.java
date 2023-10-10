
class Parent {
    public void displayParent() {
        System.out.println("I am the Parent class.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("I am the Child class.");
    }
}

public class Single_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();

        child.displayParent(); // Method from Parent class
        child.displayChild();  // Method from Child class
    }
}

