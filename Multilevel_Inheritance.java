
class Grandparent {
    public void displayGrandparent() {
        System.out.println("I am the Grandparent class.");
    }
}

class Parent extends Grandparent {
    public void displayParent() {
        System.out.println("I am the Parent class.");
    }
}

class Child extends Parent {
    public void displayChild() {
        System.out.println("I am the Child class.");
    }
}

public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Child child = new Child();

        child.displayGrandparent(); // Method from Grandparent class
        child.displayParent();      // Method from Parent class
        child.displayChild();       // Method from Child class
    }
}

