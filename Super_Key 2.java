


class Animal {
    public void move() {
        System.out.println("Animal is moving.");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        super.move(); // Invoke the overridden method from the superclass
        System.out.println("Dog is running.");
    }
}

public class Super_Key{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.move();
    }
}
